package com.javamail.constant;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public enum  MailStatus {
    UNSEND(0,"δ����"),
    SENDING(1,"������"),
    SENDFAIL(2,"����ʧ��"),
    SEND(3,"�ѷ���");

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
