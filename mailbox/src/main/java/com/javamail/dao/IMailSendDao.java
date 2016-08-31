package com.javamail.dao;

import com.javamail.constant.MailStatus;
import com.javamail.model.MailSend;

import java.util.List;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public interface IMailSendDao {
    /**
     *参数:
     *scopeFlag ：odd-奇数，偶数-even, all--所有
     *mailQueryCount 指定查询记录数（在配置文件中设置，如dev环境--dev.properties），如果传入的数小于等于0,则默认为50；
     *如果传入scopeFlag值为odd，则查询出邮件id为奇数的未发送邮件；
     *如果传入scopeFlag值为even，则查询出邮件id为偶数的未发送邮件；
     *上述以外的情况，则查询出所有未发送邮件
     */
    List<MailSend> getUnSend(String scopeFlag, int mailQueryCount);//获取未发送邮件列表

    /**
     *
     * @param id 邮件id
     * @param stautsUpdBefore 更新前邮件状态
     * @param stautsUpdAfter 更新后邮件状态
     */
    int updateSendMailStatus(int id, MailStatus stautsUpdBefore, MailStatus stautsUpdAfter); //更新邮件发送状态

}
