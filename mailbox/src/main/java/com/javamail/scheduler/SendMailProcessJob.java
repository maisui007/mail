package com.javamail.scheduler;

import com.javamail.dao.IMailSendDao;
import com.javamail.model.MailSend;
import com.javamail.thread.SendMailThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hnair20160706 on 2016/8/31.
 */

public class SendMailProcessJob {
    private String jobScopeFlag;
    private int mailQueryCount;

    // 日志
    private Logger logger = LoggerFactory.getLogger(SendMailProcessJob.class);

    @Resource(name = "mailSendDao")
    private IMailSendDao mailSendDao;

    @Resource(name = "sendMailThread")
    private SendMailThread sendMailThread;

    public void execute() {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(4, 10, 3, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(100), new ThreadPoolExecutor.CallerRunsPolicy());

        try{
            logger.info("SendMailProcessJob.execute ---jobScopeFlag = " + jobScopeFlag);
            // 从邮件信息表中取未发送邮件信息
            List<MailSend> list = mailSendDao.getUnSend(jobScopeFlag, mailQueryCount);
            if ( null== list || list.size() == 0) {
                logger.info("no send mail data ");
                return;
            }

            LinkedBlockingQueue<MailSend> queue = new LinkedBlockingQueue<MailSend>();
            queue.addAll(list);

            int size = queue.size();
            CountDownLatch latch = new CountDownLatch(size);
            sendMailThread.setQueue(queue);
            sendMailThread.setCountDownLatch(latch);

            for (int i = 0; i < size; i++) {
                // 多线程并发执行
                threadPool.execute(sendMailThread);
            }

            try {
                latch.await(5, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                logger.error("MailTask doTask fail.", e);
            }
        }catch (Throwable t) {
            logger.error("执行定时发送邮件Task时出现异常" , t);
        }finally{
            threadPool.shutdownNow();
        }

    }

    public int getMailQueryCount() {
        return mailQueryCount;
    }

    public void setMailQueryCount(int mailQueryCount) {
        this.mailQueryCount = mailQueryCount;
    }

    public String getJobScopeFlag() {
        return jobScopeFlag;
    }

    public void setJobScopeFlag(String jobScopeFlag) {
        this.jobScopeFlag = jobScopeFlag;
    }


}

