package com.mail.model;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by gll on 2016/8/26.
 */

public abstract class BaseModel implements Serializable, Comparable<BaseModel>{
    private String ID;//主键

    private Long SORT =System.currentTimeMillis();//顺序

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Long getSORT() {
        return SORT;
    }

    public void setSORT(Long SORT) {
        this.SORT = SORT;
    }

    /*========================== override ==========================*/
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        boolean rtn = false;
        if (obj != null && this.getClass().isAssignableFrom(obj.getClass())) {
            BaseModel objModel = (BaseModel) obj;
            rtn = new EqualsBuilder()
                    .append(this.getID(), objModel.getID())
                    .isEquals();
        }
        return rtn;
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37)
                .append(getID()).toHashCode();
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append(this.getID()).toString();
    }
    public int compareTo(BaseModel o) {
        return new CompareToBuilder().append(this.getSORT(), o.getSORT()).toComparison();
    }
}
