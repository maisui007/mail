package com.javamail.itf;

import com.javamail.vo.Send;
import com.javamail.model.MailSend;

/**
 * @Decription
 * ���ʼ�ʱ��ͨ������addMailTask(Send send)�ӿڣ�
 * ���ʼ���Ϣ��������һ����¼����̨���ö�ʱ����
 * ͨ��ɨ���ʼ���Ϣ���ҳ�δ���͵��ʼ���¼��
 * Ȼ��ִ���ʼ����͡�
 * Created by hnair20160706 on 2016/8/31.
 */
public interface ISendEmailServcice {
    /**
     *�����ʼ����ͷ���
     * @param send �����ʼ��������
     * @return
     */
    public int addMailTash(Send send);

    /**
     * �����ʼ�
     * @param maillSend
     */
    public void sendMail(MailSend maillSend);
}

