package com.javamail.itf;

import com.javamail.exception.MyMailException;
import com.javamail.model.MailSend;
import com.javamail.vo.Send;

/**
 * 邮件发送管理
 * Created by hnair20160706 on 2016/8/31.
 */
public interface IMailManager {
    /**
     * 新增邮件发送服务
     *
     * @param send
     * @return
     */
    public int addSend(Send send);


    /**
     * 发送邮件
     *
     * @param mailSend
     * @throws MyMailException
     */
    public void send(MailSend mailSend) throws MyMailException;
}
