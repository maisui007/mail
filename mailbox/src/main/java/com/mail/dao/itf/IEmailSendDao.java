package com.mail.dao.itf;

import com.mail.model.BaseModel;
import com.mail.model.EmailSend;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gll on 2016/8/26.
 * 邮件dao层
 * @Repository用于标注数据访问组件，即DAO组件
 */
@Repository
public interface IEmailSendDao {
    /**
     *
     * @param emailSend 查询条件
     * @return List<EmailSend> 返回结果
     */
    List<EmailSend> queryByModel(EmailSend emailSend);

    /**
     *
     * @param emailSendList 更新对象
     * @return 更新成功的记录
     */
    List<EmailSend> batchUpdate(List<EmailSend> emailSendList);

    /***
     *
     * @param emailSendList 删除对象
     * @return 删除成功的对象
     */
    List<EmailSend> batchDelete(List<EmailSend> emailSendList);

}
