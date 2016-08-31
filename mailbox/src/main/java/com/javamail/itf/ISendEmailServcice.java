package com.javamail.itf;

import com.javamail.vo.Send;
import com.javamail.model.MailSend;

/**
 * @Decription
 * 发邮件时，通过调用addMailTask(Send send)接口，
 * 向邮件信息表中增加一条记录，后台设置定时任务，
 * 通过扫描邮件信息表找出未发送的邮件记录，
 * 然后执行邮件发送。
 * Created by hnair20160706 on 2016/8/31.
 */
public interface ISendEmailServcice {
    /**
     *新增邮件发送服务
     * @param send 发送邮件服务对象
     * @return
     */
    public int addMailTash(Send send);

    /**
     * 发送邮件
     * @param maillSend
     */
    public void sendMail(MailSend maillSend);
}

