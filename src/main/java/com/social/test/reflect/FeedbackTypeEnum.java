package com.social.test.reflect;

/**
 * 用户反馈类型
 */
public enum FeedbackTypeEnum {

	NOT_SMOOTH(1, "使用卡顿"), INFORMATION_NOT_COMPLETE(2,"信息不完善"), information_sham(3,"信息虚假"), others(4,"其它");

	Integer type;
	String name;

	private FeedbackTypeEnum(Integer type, String name) {
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
