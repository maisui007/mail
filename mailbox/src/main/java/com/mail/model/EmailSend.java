package com.mail.model;

import java.util.Date;

public class EmailSend extends BaseModel{
    private String ID;

    private String RECEIVERS;

    private Integer PRIORITY;

    private String TEMPLATE;

    private String CONTET;

    private Date SEND_DATE;

    private String STATUS;

    private Date CREAED_TS;

    private Date LAST_UPDATE_TS;

    private String REMARK1;

    private String REMARK2;

    private Long SORT;

    private Integer VERSION;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getRECEIVERS() {
        return RECEIVERS;
    }

    public void setRECEIVERS(String RECEIVERS) {
        this.RECEIVERS = RECEIVERS == null ? null : RECEIVERS.trim();
    }

    public Integer getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(Integer PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getTEMPLATE() {
        return TEMPLATE;
    }

    public void setTEMPLATE(String TEMPLATE) {
        this.TEMPLATE = TEMPLATE == null ? null : TEMPLATE.trim();
    }

    public String getCONTET() {
        return CONTET;
    }

    public void setCONTET(String CONTET) {
        this.CONTET = CONTET == null ? null : CONTET.trim();
    }

    public Date getSEND_DATE() {
        return SEND_DATE;
    }

    public void setSEND_DATE(Date SEND_DATE) {
        this.SEND_DATE = SEND_DATE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public Date getCREAED_TS() {
        return CREAED_TS;
    }

    public void setCREAED_TS(Date CREAED_TS) {
        this.CREAED_TS = CREAED_TS;
    }

    public Date getLAST_UPDATE_TS() {
        return LAST_UPDATE_TS;
    }

    public void setLAST_UPDATE_TS(Date LAST_UPDATE_TS) {
        this.LAST_UPDATE_TS = LAST_UPDATE_TS;
    }

    public String getREMARK1() {
        return REMARK1;
    }

    public void setREMARK1(String REMARK1) {
        this.REMARK1 = REMARK1 == null ? null : REMARK1.trim();
    }

    public String getREMARK2() {
        return REMARK2;
    }

    public void setREMARK2(String REMARK2) {
        this.REMARK2 = REMARK2 == null ? null : REMARK2.trim();
    }

    public Long getSORT() {
        return SORT;
    }

    public void setSORT(Long SORT) {
        this.SORT = SORT;
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
    }
}