package com.javamail.vo;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public class Send {

    private String receivers;//�ʼ�������
    private String template;//ģ��
    private String content;//��Ⱦ���ݣ�����ģ�����Ӧ�Ĳ������ã�json��ʽ
    private String level;//�ʼ�����1-�ͣ�2-�У�3-��

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
