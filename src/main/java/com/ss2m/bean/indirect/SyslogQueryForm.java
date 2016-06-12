package com.ss2m.bean.indirect;

import com.spdb.ib.dpib.base.QueryInput;
import com.spdb.ib.jdup.annotation.QCondition;

/**
 * 登陆日志查询bean
 * 
 * 
 */
public class SyslogQueryForm extends QueryInput {

	// 系统号
	private String sysId;

	@QCondition(Name = "登录名")
	private String login_user_loginname;

	@QCondition(Name = "登陆IP")
	private String login_ip;

	@QCondition(Name = "查询开始日期")
	private String date_begin;

	@QCondition(Name = "查询结束日期")
	private String date_end;

	public String getLogin_user_loginname() {
		return login_user_loginname;
	}

	public void setLogin_user_loginname(String login_user_loginname) {
		this.login_user_loginname = login_user_loginname;
	}

	public String getLogin_ip() {
		return login_ip;
	}

	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
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
}
