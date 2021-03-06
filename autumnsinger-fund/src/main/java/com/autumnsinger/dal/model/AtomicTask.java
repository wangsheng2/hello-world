package com.autumnsinger.dal.model;

import java.util.Date;

public class AtomicTask {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.task_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String taskName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.task_no
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String taskNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.status
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column atomic_task.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.id
     *
     * @return the value of atomic_task.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.id
     *
     * @param id the value for atomic_task.id
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.task_name
     *
     * @return the value of atomic_task.task_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.task_name
     *
     * @param taskName the value for atomic_task.task_name
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.task_no
     *
     * @return the value of atomic_task.task_no
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getTaskNo() {
        return taskNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.task_no
     *
     * @param taskNo the value for atomic_task.task_no
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.status
     *
     * @return the value of atomic_task.status
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.status
     *
     * @param status the value for atomic_task.status
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.create_time
     *
     * @return the value of atomic_task.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.create_time
     *
     * @param createTime the value for atomic_task.create_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column atomic_task.update_time
     *
     * @return the value of atomic_task.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column atomic_task.update_time
     *
     * @param updateTime the value for atomic_task.update_time
     *
     * @mbg.generated Sun Oct 08 13:47:39 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}