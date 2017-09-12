package com.wj.mybatis.pojo;

import java.io.Serializable;

/*********************** 角色表 **************************/
public class Role implements Serializable {

    private static final long serialVersionUID = 9128027069886506908L;
    private Long id;
    private String roleName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
