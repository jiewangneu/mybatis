package com.wj.mybatis.pojo;

/*********************** 体检表父类 **************************/
public class HealthForm {
    private long id; //编号
    private long empId; //雇员编号
    private String heart; //心
    private String liver; //肝
    private String spleen; //脾
    private String lung; //肺
    private String kedney; //肾
    private String note; //备注

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    public String getKedney() {
        return kedney;
    }

    public void setKedney(String kedney) {
        this.kedney = kedney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
