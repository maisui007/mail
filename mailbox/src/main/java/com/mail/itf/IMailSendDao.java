package com.mail.itf;

import com.mail.vo.SendMailVo;

import java.util.List;

/**
 * Created by  on 2016/8/2.
 */
public interface IMailSendDao {
    /***
     *@Description 获取未发送邮件列表.如果传入scopeFlag值为odd，则查询出邮件id为奇数的未发送邮件；
     * 如果传入scopeFlag值为even，则查询出邮件id为偶数的未发送邮件；
     * @param scopFlag odd-奇数，偶数-even, all--所有
     * @param mailQueryCount 指定查询记录数（在配置文件中设置，如dev环境--dev.properties），如果传入的数小于等于0,则默认为50；
     * @return
     */
    List<SendMailVo> getUnSend(String scopFlag,int mailQueryCount);
}
