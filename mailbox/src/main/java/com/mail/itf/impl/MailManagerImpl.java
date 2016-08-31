//package com.mail.itf.impl;
//
//import com.mail.itf.IMailManager;
//import com.mail.vo.SendMailVo;
//
///**
// * ①判断邮件发送对象是否为null,
// ②如果为null,则处理结束返回 -1；
// 如果不为null,执行第③步；
// ③邮件接收人、邮件内容、模板非空检查，如果存在非空值，则处理结束直接返回-1，否则执行④步；
// ④则调用mailManager.sendMail(mail) 添加发送邮件（向邮件发送表中插入一条记录，并置状态为0-未发送），保存后返回邮件id.
// *
// * Created by  on 2016/8/2.
// */
//public class MailManagerImpl implements IMailManager {
//    /**
//     *
//     * @param sendMailModel
//     * @return
//     */
//    public int addMailSendModel(SendMailModel sendMailModel) {
//        return 0;
//    }
//
//    public void sendMail(SendMailVo sendMailVo) {
//
//    }
//}
