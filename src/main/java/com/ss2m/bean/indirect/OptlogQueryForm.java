package com.ss2m.bean.indirect;

import com.spdb.ib.dpib.base.QueryInput;
import com.spdb.ib.jdup.annotation.QCondition;

/**
 * 操作日志查询bean
 * 
 */
public class OptlogQueryForm extends QueryInput {

	// 系统号
	private String sysId;

	@QCondition(Name = "用户名称")
	private String oper_user_name;

	@QCondition(Name = "操作IP")
	private String oper_ip;

	@QCondition(Name = "功能名称")
	private String menu_name;

	private String menu_id;

	@QCondition(Name = "查询开始日期")
	private String date_begin;

	@QCondition(Name = "查询结束日期")
	private String date_end;

	public String getOper_user_name() {
		return oper_user_name;
	}

	public void setOper_user_name(String oper_user_name) {
		this.oper_user_name = oper_user_name;
	}

	public String getOper_ip() {
		return oper_ip;
	}

	public void setOper_ip(String oper_ip) {
		this.oper_ip = oper_ip;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getDate_begin() {
		return date_begin;
	}

	public void setDate_begin(String date_begin) {
		this.date_begin = date_begin;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

}
