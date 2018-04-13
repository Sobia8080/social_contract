package com.social.entity.bean.activity;


/**
 * 
 * 活动分类表
 * 
 */
public class ActivityCategory {

	/****/
	private Integer id;

	/**名称**/
	private String name;

	/**备注**/
	private String remark;

	/**创建时间**/
	private java.util.Date createTime;

	/**创建人**/
	private String creator;

	/**更新时间**/
	private java.util.Date updateTime;

	/**更新人**/
	private String updator;

	/**是否删除，N未删除，Y已删除默认N**/
	private String isDelete;



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
	}

	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return this.creator;
	}

	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdator(String updator){
		this.updator = updator;
	}

	public String getUpdator(){
		return this.updator;
	}

	public void setIsDelete(String isDelete){
		this.isDelete = isDelete;
	}

	public String getIsDelete(){
		return this.isDelete;
	}

}
