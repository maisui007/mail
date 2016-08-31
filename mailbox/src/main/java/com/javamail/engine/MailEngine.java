package com.javamail.engine;

import com.javamail.constant.MailSendResult;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * �ʼ���������
 * Created by hnair20160706 on 2016/8/31.
 */
public class MailEngine {
    private final static Logger logger = LoggerFactory.getLogger(MailEngine.class);

    @Resource(name = "velocityEngine")
    private VelocityEngine velocityEngine;

    @Resource(name = "mailSubjectConfig")
    private Map<String,String> mailSubjectConfig;

    @Resource(name = "mailSenderMap")
    private HashMap<String,JavaMailSender> mailSenderMap;

    @Resource(name = "senderMap")
    private HashMap<String,String> senderMap;


    private Random random = new Random();// �����

    /**
     * �ʼ�ģ��ǰ׺
     */
    private final static String VM_PREFIX = "velocity/";

    /**
     * �ʼ�ģ���׺
     */
    private final static String VM_SUFFIX = ".vm";

    /**
     * �ʼ�����
     */
    private String mailEncoding = "UTF-8";


    /**
     * �ʼ�����
     */
    private String subject;

    /**
     * �����ʼ�
     *
     * @param receivers
     *            �ռ�������
     * @param html
     *            �Ƿ���HTML��ʽչʾ
     * @param vmName
     *            �ʼ�ģ������
     * @param model
     *            ���ݼ�
     * @throws MessagingException
     */
    public int send(String[] receivers, boolean html, String vmName, Map<String, Object> model)
            throws MessagingException {
        String vmFileName = VM_PREFIX + vmName + VM_SUFFIX;

        // �ʼ�����
        String subject = mailSubjectConfig.get(vmName);

        return send(receivers, subject, html, model, vmFileName);
    }

    /**
     * �����ʼ�
     *
     * @param receivers
     *            �ռ�������
     * @param mailSubject
     *            �ʼ�����
     * @param html
     *            �Ƿ���HTML��ʽչʾ
     * @param model
     *            ���ݼ�
     * @throws MessagingException
     */
    public int send(String[] receivers, String mailSubject, boolean html, Map<String, Object> model, String vmFileName) {

        int result = MailSendResult.MAIL_SEND_FAIL.getValue();
        String sender = "";
        JavaMailSender mailSender = null;

        try {
            //�������ļ�config-mail.xml ��ȡmailSender
            int r = random.nextInt(5);
            if(senderMap != null && mailSenderMap != null){
                sender = senderMap.get(String.valueOf(r));
                mailSender = mailSenderMap.get(String.valueOf(r));
            }else{
                logger.error("MailEngine send fail.senderMap or mailSenderMap error.senderMap:{},mailSenderMap:{}",
                        senderMap, mailSenderMap);
                return result;
            }

            if(StringUtils.isBlank(sender) ||  null == mailSender || "".equals(mailSender)){
                logger.error("MailEngine send fail.sender or mailSender error.sender:{},mailSender:{}",
                        sender ,mailSender);
                return result;
            }

            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper messagehelper = new MimeMessageHelper(mimeMessage, true, mailEncoding);

            // ����VMҳ�������Ⱦ
            String content = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, vmFileName, mailEncoding, model);

            //���÷������ǳ�
            String nick="";
            try {
                nick=javax.mail.internet.MimeUtility.encodeText("xxx");
                messagehelper.setFrom(sender,nick);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                logger.error("�����ʼ�ʱ�������ǳ��쳣��",e);
                messagehelper.setFrom(sender);
            }

            messagehelper.setTo(receivers);
            messagehelper.setSubject(subject);
            if (StringUtils.isNotBlank(mailSubject)) {
                messagehelper.setSubject(mailSubject);
            }
            messagehelper.setText(content, html);

            mailSender.send(mimeMessage);

            result = MailSendResult.MAIL_SEND_SUCCESS.getValue();

            logger.info("MailEngine send success. sender=" + sender + ",receivers=" + receivers[0].toString());

        } catch (Exception e) {
            logger.error("MailEngine send fail.", e);
        }

        return result;

    }

    public void setMailEncoding(String mailEncoding) {
        this.mailEncoding = mailEncoding;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
