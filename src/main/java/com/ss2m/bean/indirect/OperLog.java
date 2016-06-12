package com.ss2m.bean.indirect;

import java.io.Serializable;
import com.spdb.ib.jdup.annotation.RSColumn;

/**
 * 登陆日志bean
 * 
 */
public class OperLog implements Serializable {

	private static final long serialVersionUID = 1L;

	// 系统号
	private String sysId;
	// ROW_ID
	private Long row_id;
	// 操作人名称
	@RSColumn(Name = "用户名")
	private String oper_user_name;
	// 功能名称
	@RSColumn(Name = "功能名称")
	private String menu_name;
	// 操作人IP
	@RSColumn(Name = "操作IP")
	private String oper_ip;
	// 操作时间
	@RSColumn(Name = "操作时间")
	private String oper_date;
	// 操作起点日期(查询需要)
	private String date_begin;
	// 操作结束日期(查询需要)
	private String date_end;
	// 功能id
	private String menu_id;

	public Long getRow_id() {
		return row_id;
	}

	public void setRow_id(Long row_id) {
		this.row_id = row_id;
	}

	public String getOper_user_name() {
		return oper_user_name;
	}

	public void setOper_user_name(String oper_user_name) {
		this.oper_user_name = oper_user_name;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getOper_ip() {
		return oper_ip;
	}

	public void setOper_ip(String oper_ip) {
		this.oper_ip = oper_ip;
	}

	public String getOper_date() {
		return oper_date;
	}

	public void setOper_date(String oper_date) {
		this.oper_date = oper_date;
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
