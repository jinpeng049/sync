package com.yixiang.np.service.impl;

import com.yixiang.np.constant.Constant;
import com.yixiang.np.model.vo.EmailVo;
import com.yixiang.np.service.EmailService;
import freemarker.template.Template;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmailServiceImpl implements EmailService {

    private static final Logger LOG = LoggerFactory.getLogger(EmailServiceImpl.class);
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;
    @Autowired
    private SimpleMailMessage simpleMailMessage;
    private static final String ENCODING = "utf-8";

    /**
     * 发送带附件的html格式邮件
     */
    public void sendEmail(EmailVo email) {
        LOG.debug("sendEmail email:{};", email);

        MimeMessage msg = null;
        try {
            msg = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, ENCODING);
            helper.setFrom(simpleMailMessage.getFrom());
            helper.setTo(email.getEmailTo());
            helper.setSubject(MimeUtility.encodeText(email.getSubject(), ENCODING, "B"));
            helper.setText(getMailText(email), true); // true表示text的内容为html

            // 添加内嵌文件，第1个参数为cid标识这个文件,第2个参数为资源
            //helper.addInline("welcomePic", new File("d:/welcome.gif")); // 附件内容

            // 这里的方法调用和插入图片是不同的，解决附件名称的中文问题
            //File file = new File("d:/欢迎注册.docx");
            //helper.addAttachment(MimeUtility.encodeWord(file.getName()), file);
        } catch (Exception e) {
            LOG.error("error happens______", e);
            throw new RuntimeException("error happens", e);
        }
        mailSender.send(msg);
        System.out.println("邮件发送成功...");
    }

    /**
     * 通过模板构造邮件内容，参数content将替换模板文件中的${content}标签。
     */
    private String getMailText(EmailVo email) throws Exception {
        // 通过指定模板名获取FreeMarker模板实例
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate(email.getTemplate());

        // FreeMarker通过Map传递动态数据
        Map<String, String> map = new HashMap<String, String>();
        map.put("orderNumber", email.getOrderNumber());
        map.put("payDate", email.getPayDate());
        map.put("ticketDate", email.getTicketDate());
        map.put("deptAirlineNo", email.getDeptAirlineNo());
        map.put("deptSeatClass", Constant.SeatClass(email.getDeptSeatClass()));
        map.put("deptAirPort", email.getDeptAirPort());
        map.put("deptArrAirPort", email.getDeptArrAirPort());
        map.put("deptAirportCode", email.getDeptAirportCode());
        map.put("deptArrAirportCode", email.getDeptArrAirportCode());
        map.put("deptDate", email.getDeptDate());
        map.put("deptTime", email.getDeptTime());
        map.put("deptArrTime", email.getDeptArrTime());
        map.put("deptIntervalDay", email.getDeptIntervalDay());
        map.put("arrAirlineNo", StringUtils.isNotEmpty(email.getArrAirlineNo()) ? email.getArrAirlineNo() : "");
        map.put("arrSeatClass", StringUtils.isNotEmpty(Constant.SeatClass(email.getArrSeatClass())) ? Constant.SeatClass(email.getArrSeatClass()) : "");
        map.put("arrAirPort", StringUtils.isNotEmpty(email.getArrAirPort()) ? email.getArrAirPort() : "");
        map.put("arrArrAirPort", StringUtils.isNotEmpty(email.getArrArrAirPort()) ? email.getArrArrAirPort() : "");
        map.put("arrAirportCode", StringUtils.isNotEmpty(email.getArrAirportCode()) ? email.getArrAirportCode() : "");
        map.put("arrArrAirportCode", StringUtils.isNotEmpty(email.getArrArrAirportCode()) ? email.getArrArrAirportCode() : "");
        map.put("arrDate", StringUtils.isNotEmpty(email.getArrDate()) ? email.getArrDate() : "");
        map.put("arrTime", StringUtils.isNotEmpty(email.getArrTime()) ? email.getArrTime() : "");
        map.put("arrArrTime", StringUtils.isNotEmpty(email.getArrArrTime()) ? email.getArrArrTime() : "");
        map.put("arrIntervalDay", StringUtils.isNotEmpty(email.getArrIntervalDay()) ? email.getArrIntervalDay() : "");
        map.put("unitPrice", StringUtils.isNotEmpty(email.getUnitPrice()) ? email.getUnitPrice() : "");
        map.put("purchQuantity", StringUtils.isNotEmpty(email.getPurchQuantity()) ? email.getPurchQuantity() : "");
        map.put("totalPrice", StringUtils.isNotEmpty(email.getTotalPrice()) ? email.getTotalPrice() : "");
        map.put("goDepartureTerminal", StringUtils.isNotEmpty(email.getGoDepartureTerminal()) ? email.getGoDepartureTerminal() : "");
        map.put("goArrivalTerminal", StringUtils.isNotEmpty(email.getGoArrivalTerminal()) ? email.getGoArrivalTerminal() : "");
        map.put("backDepartureTerminal", StringUtils.isNotEmpty(email.getBackDepartureTerminal()) ? email.getBackDepartureTerminal() : "");
        map.put("backArrivalTerminal", StringUtils.isNotEmpty(email.getBackArrivalTerminal()) ? email.getBackArrivalTerminal() : "");
        map.put("isReturn", email.getReturn().toString());
        // 解析模板并替换动态数据，最终content将替换模板文件中的${content}标签。
        String htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        return htmlText;
    }

}