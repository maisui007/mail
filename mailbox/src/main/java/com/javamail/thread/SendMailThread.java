package com.javamail.thread;

import com.javamail.model.MailSend;

import com.javamail.itf.ISendEmailServcice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
@Service("sendMailThread")
public class SendMailThread implements Runnable {
    // ��־
    private Logger logger = LoggerFactory.getLogger(SendMailThread.class);

    @Resource(name = "mailService")
    private ISendEmailServcice mailService;

    private LinkedBlockingQueue<MailSend> queue = new LinkedBlockingQueue<MailSend>();
    private CountDownLatch countDownLatch;

    @Override
    public void run() {
        // ȡ�����ʼ���¼
        MailSend mail = queue.poll();

        if (mail != null) {
            logger.info("��ʱ�����ʼ�����  mailID ��" +mail.getId());
            mailService.sendMail(mail);
        }
        countDownLatch.countDown();
    }

    public void setQueue(LinkedBlockingQueue<MailSend> queue) {
        this.queue = queue;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
}
