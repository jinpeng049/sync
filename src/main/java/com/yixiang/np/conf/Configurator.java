/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.yixiang.np.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.yixiang.np.config.DatabaseConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * MyBatis基础配置
 *
 * @author liuzh
 * @since 2015-12-19 10:11
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.yixiang.np.service", "com.yixiang.np.mapper", "com.yixiang.np.config"})
@PropertySource("classpath:platform.properties")
@MapperScan({"com.yixiang.np.dao"})
public class Configurator implements TransactionManagementConfigurer {

    private static final Logger LOG = LoggerFactory.getLogger(Configurator.class);

    @Autowired
    private DataSource dataSource;

    @Resource
    private DatabaseConfig databaseConfig;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private SimpleClientHttpRequestFactory simpleClientHttpRequestFactory;

    @Bean
    public DataSource dataSource() {
        try {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setUrl(databaseConfig.getUrl());
            dataSource.setUsername(databaseConfig.getUser());
            dataSource.setPassword(databaseConfig.getPassword());
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setInitialSize(1);
            dataSource.setMinIdle(1);
            dataSource.setMaxActive(20);
            dataSource.setMaxWait(60000);
            dataSource.setTimeBetweenEvictionRunsMillis(60000);
            dataSource.setMinEvictableIdleTimeMillis(300000);
            dataSource.setValidationQuery("select 'x' from dual");
            dataSource.setTestWhileIdle(true);
            dataSource.setTestOnBorrow(false);
            dataSource.setTestOnReturn(false);
            dataSource.setPoolPreparedStatements(false);
            dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
            dataSource.setFilters("stat");
            return dataSource;
        } catch (SQLException e) {
            return null;
        }
    }

    @Bean
    public MapperHelper mapperHelper() {
        MapperHelper mapperHelper = new MapperHelper();
        Properties properties = new Properties();
        properties.setProperty("ORDER", "AFTER");
        mapperHelper.setProperties(properties);
//        mapperHelper.registerMapper(Mapper.class);
        mapperHelper.processConfiguration(sqlSessionFactory.getConfiguration());
        return mapperHelper;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() {
        try {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(dataSource);
            //分页插件
//            PageHelper pageHelper = new PageHelper();
//            Properties properties = new Properties();
//            properties.setProperty("reasonable", "true");
//            properties.setProperty("supportMethodsArguments", "true");
//            properties.setProperty("returnPageInfo", "check");
//            properties.setProperty("params", "count=countSql");
//            pageHelper.setProperties(properties);

            //添加插件
//            factoryBean.setPlugins(new Interceptor[]{pageHelper});
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//            factoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*.xml"));
            factoryBean.setConfigLocation(new ClassPathResource("mybatis/Config.xml"));
            return factoryBean.getObject();
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            return null;
        }
    }

//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setTypeAliasesPackage("tk.mybatis.springboot.model");
//
//        //分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("returnPageInfo", "check");
//        properties.setProperty("params", "count=countSql");
//        pageHelper.setProperties(properties);
//
//        //添加插件
//        bean.setPlugins(new Interceptor[]{pageHelper});
//
//        //添加XML目录
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
//            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SimpleClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setConnectTimeout(5000);
        return simpleClientHttpRequestFactory;
    }

    private
    @Value("${email.host}")
    String host;
    private
    @Value("${email.username}")
    String username;
    private
    @Value("${email.password}")
    String _password;
    private
    @Value("${email.port}")
    int port;

    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setUsername(username);
        mailSender.setPassword(_password);
        mailSender.setPort(port);
        mailSender.setDefaultEncoding("UTF-8");
        Properties javaMailProperties = new Properties();
        javaMailProperties.setProperty("mail.smtp.auth", "true");
        javaMailProperties.setProperty("mail.smtp.starttls.enable", "true");
        javaMailProperties.setProperty("mail.mime.charset", "UTF-8");
        javaMailProperties.setProperty("mail.transport.protocol", "smtp");
        mailSender.setJavaMailProperties(javaMailProperties);
        return mailSender;
    }

    private
    @Value("${mailtplt.from}")
    String from;

    @Bean
    public SimpleMailMessage simpleMailMessage() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setSubject("sfs");
        return simpleMailMessage;
    }

    /**
     * FreeMarker模板配置
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("classpath:templates/");
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");
        return freeMarkerConfigurer;
    }
}
