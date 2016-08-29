package com;

import com.mail.util.MailSenderServiceUtil;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hnair20160706 on 2016/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class MailTest {
    @Autowired
    private MailSenderServiceUtil mailSender;
    @Test
    public void Mail(){

        VelocityEngine ve = mailSender.getVelocityEngine();
//        Template t = ve.getTemplate("mail.vm");//取得模板
        //注册完马上发送邮件
        mailSender.setTo("zhangjnming@163.com");
        mailSender.setSubject("来自mail的邮件");
        mailSender.setTemplateName("mail.vm");//设置的邮件模板
        Map model=new HashMap();
        model.put("username", "junm.zhang");
        String url="";
//        url=url.substring(0, url.lastIndexOf("/"));
        model.put("url", url);
        model.put("email", "zhangjnming@163.com");
        mailSender.sendWithTemplate(model);
        System.out.println("邮件发送成功！");
    }
}
