package com.mochentech.kxjf.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;

import java.util.Date;

@SuppressWarnings("serial")
public class User extends SuperEntity<User>{

    private Integer allLoanNum;

    private Integer allShareNumber;

    private Date attentionTime;

    private Integer isSend;

    private Date lastLoginTime;

    private String mobile;

    private String openId;

    private Integer parentOne;

    private Integer parentTwo;

    private Integer status;

    private Date unAttentionTime;

    private Integer userLevel;

    private Integer vipLevel;

    public Integer getAllLoanNum() {
        return allLoanNum;
    }

    public void setAllLoanNum(Integer allLoanNum) {
        this.allLoanNum = allLoanNum;
    }

    public Integer getAllShareNumber() {
        return allShareNumber;
    }

    public void setAllShareNumber(Integer allShareNumber) {
        this.allShareNumber = allShareNumber;
    }

    public Date getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(Date attentionTime) {
        this.attentionTime = attentionTime;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getParentOne() {
        return parentOne;
    }

    public void setParentOne(Integer parentOne) {
        this.parentOne = parentOne;
    }

    public Integer getParentTwo() {
        return parentTwo;
    }

    public void setParentTwo(Integer parentTwo) {
        this.parentTwo = parentTwo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUnAttentionTime() {
        return unAttentionTime;
    }

    public void setUnAttentionTime(Date unAttentionTime) {
        this.unAttentionTime = unAttentionTime;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }
}
