package com.community.pojo;

import java.io.Serializable;

public class TbComplain implements Serializable{
    private String id;

    private String content;

    private String userid;

    private Integer star;

    private String remarks;

    private String adminid;

    private Integer complainStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public Integer getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(Integer complainStatus) {
        this.complainStatus = complainStatus;
    }
}