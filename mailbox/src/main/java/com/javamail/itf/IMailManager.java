package com.javamail.itf;

import com.javamail.exception.MyMailException;
import com.javamail.model.MailSend;
import com.javamail.vo.Send;

/**
 * �ʼ����͹���
 * Created by hnair20160706 on 2016/8/31.
 */
public interface IMailManager {
    /**
     * �����ʼ����ͷ���
     *
     * @param send
     * @return
     */
    public int addSend(Send send);


    /**
     * �����ʼ�
     *
     * @param mailSend
     * @throws MyMailException
     */
    public void send(MailSend mailSend) throws MyMailException;
}
