package com.mail.mapper;

import com.mail.model.EmailSend;

public interface EmailSendMapper {
    int deleteByPrimaryKey(String ID);

    int insert(EmailSend record);

    int insertSelective(EmailSend record);

    EmailSend selectByPrimaryKey(String ID);

    int updateByPrimaryKeySelective(EmailSend record);

    int updateByPrimaryKey(EmailSend record);
}