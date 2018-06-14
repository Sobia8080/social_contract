package com.social.test.reflect;

/**
 * 活动发送类型
 */
public enum ActivitySendTypeEnum {

	member	(1, "会员发起"), SYSTERM(2, "后台发起"), OWNER(3,"房东发起"), AGENCY(4,"中介发起");

	Integer type;
	String name;

	private ActivitySendTypeEnum(Integer type, String name) {
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
