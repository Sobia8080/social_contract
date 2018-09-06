package com.social.generate;


import com.speed.klutz.Generate;
import com.speed.klutz.controller.ControllerGenerator;
import com.speed.klutz.dao.DaoGenerator;
import com.speed.klutz.service.ServiceGenerator;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @FileName CodePulugins.java
 * @ClassName CodePulugins
 * @date 2017年10月29日 下午2:56:46
 * @Description 代码生成器
 */
public class CodePulugins {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		

		//要生成的表名
		List<String> tableNames = new ArrayList<>();

		//系统其他表
//		tableNames.add("sys_feedback");
//		tableNames.add("question_info");
//		tableNames.add("profession_info");
//		tableNames.add("app_info");
//		tableNames.add("sys_school");
		
		//系统用户
//		tableNames.add("sys_authority");
//		tableNames.add("sys_user");
//		tableNames.add("sys_role");

		//系统记录
//		tableNames.add("user_login_records");
//		tableNames.add("systerm_operation_records");
		tableNames.add("scs_delivery_time");
		    
		//标签 - 系统标签
//		tableNames.add("hobby_lable");
//		tableNames.add("personal_lable");
//		tableNames.add("question_lable");
//		tableNames.add("roommate_lable");
		
		
		
		//活动
//		tableNames.add("activity_category");
//		tableNames.add("activity_comment");
//		tableNames.add("activity_join_info");
//		tableNames.add("activity_organize_info");

		//聊天
//		tableNames.add("chat_group");
//		tableNames.add("chat_history_info");
//		tableNames.add("chat");

		//企业
//		tableNames.add("enterprice_image_info");
//		tableNames.add("enterprise_info");

		
		 
		
		//标签 - 会员标签
//		tableNames.add("member_hobby_lable");
//		tableNames.add("member_personal_lable");
//		tableNames.add("member_question_lable");
//		tableNames.add("member_roommate_lable");

		//会员
//		tableNames.add("member_info");
//		tableNames.add("member_account");
//		tableNames.add("member_collection");
//		tableNames.add("member_credentials_image");
//		tableNames.add("member_footstep");
//		tableNames.add("member_photo");
//		tableNames.add("member_personal_lable");

//		//发布
//		tableNames.add("house_image_info");
//		tableNames.add("house_publish_info");
//		tableNames.add("find_roommate_lable");
//		tableNames.add("find_roommate_publish");
//		
//		//生成部分文件
//		//daoGenerator.generateTable(tableNames);
//		
		//======================== DAO
		DaoGenerator daoGenerator = new DaoGenerator();
		
//		//生成Bean
//		//daoGenerator.generateTableForEntity();
		daoGenerator.generateTableForEntity(tableNames);
//
//		//生成Mapper接口
		//daoGenerator.generateTableForMapper();
		daoGenerator.generateTableForMapper(tableNames);
//
//		//生成Xml
//		//daoGenerator.generateTableForMapperXml();
		daoGenerator.generateTableForMapperXml(tableNames);
//
//		//======================== Service
		Generate serviceGenerator = new ServiceGenerator();
//		//serviceGenerator.generateTable();
		//serviceGenerator.generateTable(tableNames);

		//======================== Controller
		Generate controllerGenerator = new ControllerGenerator();
		//controllerGenerator.generateTable();
		//controllerGenerator.generateTable(tableNames);

		System.out.println("---文件生成成功!");
	}


}
