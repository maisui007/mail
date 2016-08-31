package com.javamail.constant;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public enum  MailStatus {
    UNSEND(0,"未发送"),
    SENDING(1,"发送中"),
    SENDFAIL(2,"发送失败"),
    SEND(3,"已发送");

    private Integer value;
    private String text;
    private MailStatus(Integer value,String text){
        this.value = value;
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
