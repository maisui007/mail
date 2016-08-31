package com.javamail.dao;

import com.javamail.constant.MailStatus;
import com.javamail.model.MailSend;

import java.util.List;

/**
 * Created by hnair20160706 on 2016/8/31.
 */
public interface IMailSendDao {
    /**
     *����:
     *scopeFlag ��odd-������ż��-even, all--����
     *mailQueryCount ָ����ѯ��¼�����������ļ������ã���dev����--dev.properties��������������С�ڵ���0,��Ĭ��Ϊ50��
     *�������scopeFlagֵΪodd�����ѯ���ʼ�idΪ������δ�����ʼ���
     *�������scopeFlagֵΪeven�����ѯ���ʼ�idΪż����δ�����ʼ���
     *�����������������ѯ������δ�����ʼ�
     */
    List<MailSend> getUnSend(String scopeFlag, int mailQueryCount);//��ȡδ�����ʼ��б�

    /**
     *
     * @param id �ʼ�id
     * @param stautsUpdBefore ����ǰ�ʼ�״̬
     * @param stautsUpdAfter ���º��ʼ�״̬
     */
    int updateSendMailStatus(int id, MailStatus stautsUpdBefore, MailStatus stautsUpdAfter); //�����ʼ�����״̬

}
