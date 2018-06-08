package com.social.entity.bean.activity;


/**
 * 
 * 
 * 
 */
public class LockConfig {

	/****/
	private Integer id;

	/****/
	private String lockName;

	/****/
	private java.util.Date createTime;

	/****/
	private java.util.Date updateTime;



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setLockName(String lockName){
		this.lockName = lockName;
	}

	public String getLockName(){
		return this.lockName;
	}

	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

}
