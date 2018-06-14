package com.social.test.reflect;

/**
 * 活动参与状态
 */
public enum ActivityJoinStatusEnum {

	REGISTER(0, "已报名"), TENTATIVE(1, "暂定"),CANCEL(2,"取消预约");

	Integer type;
	String name;

	private ActivityJoinStatusEnum(Integer type, String name) {
		this.type = type;
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
