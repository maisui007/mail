package com.mail.service.itf;

import com.mail.model.EmailSend;
import org.springframework.stereotype.Service;

/**
 * Created by gll on 2016/8/26.
 * @Service用于标注业务层组件
 */
@Service
public interface IEmailSendService extends IBaseService<EmailSend> {
}
