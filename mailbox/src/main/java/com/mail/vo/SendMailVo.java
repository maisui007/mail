package com.mail.vo;

/**
 * Created by hnair20160706 on 2016/8/1.
 */
public class SendMailVo {
    private String receivers;//邮件接收人，有多名收件人';'隔开
    private String template;//模板（当前有两个模板： restPayPwdCode.vm 重置密码邮件模板restPayPwdSuccess.vm 密码重置成功通知邮件模板）
    private String content;//渲染内容，根据模板对应参数设置，json格式
    private String level;//邮件级别 1-低，2-中，3-高

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
