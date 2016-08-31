package com.javamail.constant;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public enum MailSendResult {
    MAIL_SEND_FAIL(1,"Ê§°Ü"),
    MAIL_SEND_SUCCESS(2,"³É¹¦");



    private Integer value;
    private String text;
    private MailSendResult(Integer value,String text){
        this.value=value;
        this.text = text;
    }
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
