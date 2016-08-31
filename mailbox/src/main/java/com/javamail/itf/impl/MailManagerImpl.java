package com.javamail.itf.impl;

import com.javamail.dao.IMailSendDao;
import com.javamail.exception.MyMailException;
import com.javamail.itf.IMailManager;
import com.javamail.model.MailSend;
import com.javamail.vo.Send;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


/**
 * Created by hnair20160706 on 2016/8/31.
 */
public class MailManagerImpl implements IMailManager{
    private static final Logger logger = LoggerFactory.getLogger(MailManagerImpl.class);
   @Resource(name="mailSendDao")
    private IMailSendDao mailSendDao;



    public int addSend(Send send) {
        return 0;
    }

    public void send(MailSend mailSend) throws MyMailException {

    }
}
