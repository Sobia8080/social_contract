package com.social.mapper.activity;

import com.social.entity.bean.activity.LockConfig;
import org.apache.ibatis.annotations.Param;
import com.social.entity.vo.page.PageVo;
import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * 
 */
public interface LockConfigMapper {


	/**
	 * 
	 * 根据对象的不为null的值作为条件进行查找，并且确定值找出一个值
	 * 
	 */
	 LockConfig  selectOnlyOfSelective(LockConfig record);

	/**
	 * 
	 * 根据对象的不为null的值作为条件进行查找
	 * 
	 */
	 List<LockConfig>  selectSelective(LockConfig record);

	/**
	 * 
	 * 动态分页，筛选条件 - 默认为最新时间排序
	 * 
	 */
	 List<LockConfig>  selectPageSelective(@Param("pageVo") PageVo<LockConfig> pageVo);

	/**
	 * 
	 * 查找数据总记录数
	 * 
	 */
	Integer selectDataCountSize(@Param("condition") Map<String, String> condition,@Param("likeCondition")Map<String, String> likeCondition);

	/**
	 * 
	 * 根据Id进行查询
	 * 
	 */
	LockConfig  selectOfId(@Param("id") Integer id);

	/**
	 * 
	 * 根据多个Id进行查询
	 * 
	 */
	List<LockConfig>  selectOfIds(@Param("ids") List<Integer> id);

	/**
	 * 
	 * 根据Id范围进查询
	 * 
	 */
	List<LockConfig>  selectOfIdScopes(@Param("lessId") Integer lessId,@Param("largeId")Integer largeId);

	/**
	 * 
	 * 根据多条件值进行查询
	 * 
	 */
	List<LockConfig>  selectSelectiveMany(@Param("batchBeans") List<LockConfig> record);

	/**
	 * 
	 * 根据条件进行查询去重
	 * 
	 */
	List<LockConfig>  selectSelectiveOfDistince(LockConfig record);

	/**
	 * 
	 * 根据多条件值进行查询去重
	 * 
	 */
	List<LockConfig>  selectSelectiveManyOfDistince(@Param("batchBeans") List<LockConfig> record);

	/**
	 * 
	 * 根据对象的不为null的值作为条件进行删除
	 * 
	 */
	Integer deleteSelective( LockConfig record );

	/**
	 * 
	 * 根据Id进行删除
	 * 
	 */
	Integer deleteSelectiveOfId(@Param("id") Integer id);

	/**
	 * 
	 * 根据多个Id进行删除
	 * 
	 */
	Integer deleteSelectiveOfIds(@Param("ids") List<Integer> ids);

	/**
	 * 
	 * 添加数据，只添加不为null的数据
	 * 
	 */
	Integer insertSelective( LockConfig record );

	/**
	 * 
	 * 批量添加数据，添加所有字段的数据
	 * 
	 */
	Integer batchInsert(@Param("batchField") List<LockConfig> record);

	/**
	 * 
	 * 批量添加数据，添加动态字段的数据，建议每次100条
	 * 
	 */
	Integer batchInsertSelective(@Param("batchField") List<LockConfig> record);

	/**
	 * 
	 * 更新不为null的数据，不会将其他字段更新为null
	 * 
	 */
	Integer updateSelective(@Param("updateRecord") LockConfig updateRecord,@Param("conditionRecord") LockConfig conditionRecord);


	/**
	 * 
	 * 根据Id作为条件进行更新
	 * 
	 */
	Integer updateSelectiveOfId(@Param("updateRecord") LockConfig updateRecord);


	/**
	 * 
	 * 根据批量Id进行更新
	 * 
	 */
	Integer batchUpdateOfIds(@Param("updateRecord") LockConfig updateRecord,@Param("ids") List<Integer> ids);

}