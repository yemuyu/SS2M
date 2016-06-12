package com.ss2m.bean.indirect;

import java.io.Serializable;

import com.spdb.ib.jdup.annotation.RSColumn;

/**
 * 登陆日志bean
 * 
 */
public class SysLog implements Serializable {

	private static final long serialVersionUID = 1L;

	// 系统号
	private String sysId;
	// ROW_ID
	private Long row_id;
	
	@RSColumn(Name = "登录名")
	private String login_user_loginname;
	// 登陆人名称
	@RSColumn(Name = "用户名称")
	private String login_user_name;
	// 登陆人IP
	@RSColumn(Name = "登陆IP")
	private String login_ip;
	// 登陆人时间
	@RSColumn(Name = "登陆时间")
	private String login_date;
	// 登陆起点日期(查询需要)
	private String date_begin;
	// 登陆结束日期(查询需要)

	private String date_end;

	public Long getRow_id() {
		return row_id;
	}

	public void setRow_id(Long row_id) {
		this.row_id = row_id;
	}

	public String getLogin_user_loginname() {
		return login_user_loginname;
	}

	public void setLogin_user_loginname(String login_user_loginname) {
		this.login_user_loginname = login_user_loginname;
	}

	public String getLogin_date() {
		return login_date;
	}

	public void setLogin_date(String login_date) {
		this.login_date = login_date;
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

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}
}
