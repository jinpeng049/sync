package com.yixiang.np.conf;

import com.yixiang.np.quartz.SyncOrderTicketTask;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by LiZhengYong on 2016/6/17.
 */
@Configuration
@EnableScheduling
@AutoConfigureAfter(Configurator.class)
@ComponentScan(basePackages = {"com.yixiang.np.quartz"})
public class QuartzConfigurator implements SchedulingConfigurer {

    @Bean
    public SyncOrderTicketTask syncOrderTicket() {
        return new SyncOrderTicketTask();
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }

    @Bean(destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }

}
