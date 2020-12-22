package com.digitalchina.ldp.app.dmp.service;

import java.util.List;
import java.util.Map;

import com.digitalchina.ldp.app.dmp.bean.DataConfigBean;
import com.digitalchina.ldp.bean.Model;
import com.digitalchina.ldp.bean.PageList;

/**
 * 各个委办局有多少张表
 * @author zhangyg
 *
 */
public interface ITransDataManService {
	
	/**
	 * 根据委办局别名、表名、字段名，查询出此字段相应的转换规则
	 * @param argsMap
	 * @param args
	 * @return
	 */
	public List<DataConfigBean> getDataRule(Model argsMap, Object... args) ;
	
	/**
	 * 根据规则代码、起止日期，查询转换结果（成功数据量、失败数据量）
	 * @return
	 */
	public PageList<Map<String, Object>> getTransResultInfo(Model argsMap, Object... args) ;
	
	/**
	 * 根据转换规则代号，查询建立转换规则的字段及字段名
	 * @param argsMap
	 * @param args
	 * @return
	 */
	public List<Map<String,Object>> getErrorFieldAndName(Model argsMap, Object... args) ;
	
	/**
	 * 根据日期及转换规则代号，查询出所有异常数据详情
	 * @param argsMap
	 * @return
	 */
	public PageList<Map<String, Object>> getOneDayFailedInfo(Model argsMap, Object... args) ;
}