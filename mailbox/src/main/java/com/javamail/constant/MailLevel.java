package com.javamail.constant;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public enum MailLevel {
    LOW(1,"��"),
    MID(2,"��"),
    HIGH(3,"��");
    private Integer value;
    private String text;

    private MailLevel(Integer value, String text) {
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
