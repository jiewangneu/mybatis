package com.wj.mybatis.pojo;

/*********************** 雇员任务表 **************************/
public class EmployeeTask {
    private Long id; //编号
    private Long empId; //雇员编号
    private Task task = null; //任务编号
    private String taskName; //任务名称
    private String note; //备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
