package com.javamail.vo;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public class Send {

    private String receivers;//邮件接收人
    private String template;//模板
    private String content;//渲染内容，根据模板给对应的参数设置，json格式
    private String level;//邮件级别：1-低，2-中，3-高

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
