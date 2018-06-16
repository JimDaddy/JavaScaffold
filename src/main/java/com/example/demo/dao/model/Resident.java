package com.example.demo.dao.model;

import java.util.Date;
import javax.persistence.*;

public class Resident {
    /**
     * 主键，住户ID
     */
    @Column(name = "resident_id")
    private String residentId;

    /**
     * 住户姓名
     */
    private String name;

    /**
     * 手机号
     */
    @Column(name = "mobile_num")
    private String mobileNum;

    /**
     * 身份证号
     */
    @Column(name = "social_id")
    private String socialId;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 获取主键，住户ID
     *
     * @return resident_id - 主键，住户ID
     */
    public String getResidentId() {
        return residentId;
    }

    /**
     * 设置主键，住户ID
     *
     * @param residentId 主键，住户ID
     */
    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    /**
     * 获取住户姓名
     *
     * @return name - 住户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置住户姓名
     *
     * @param name 住户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return mobile_num - 手机号
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * 设置手机号
     *
     * @param mobileNum 手机号
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    /**
     * 获取身份证号
     *
     * @return social_id - 身份证号
     */
    public String getSocialId() {
        return socialId;
    }

    /**
     * 设置身份证号
     *
     * @param socialId 身份证号
     */
    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}