package com.mail.dao.impl;

import com.mail.dao.itf.IEmailSendDao;
import com.mail.mapper.EmailSendMapper;
import com.mail.model.EmailSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gll on 2016/8/26.
 */
@Repository
public class EmailSendDaoImpl  implements IEmailSendDao {
    @Autowired
    private EmailSendMapper emailSendMapper;


    public List<EmailSend> queryByModel(EmailSend emailSend) {
        return null;
    }

    public List<EmailSend> batchUpdate(List<EmailSend> emailSendList) {
        return null;
    }

    public List<EmailSend> batchDelete(List<EmailSend> emailSendList) {
        return null;
    }
}
