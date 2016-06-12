package com.ss2m.bean.indirect;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Role implements Serializable {
	private static final long serialVersionUID = 6887698426997786936L;
	private String role_id;
	private String role_name;
	private String role_description;
	private String role_delflag;
	private String role_addby;
	private Date role_addtime;
	private String role_modifyby;
	private Date role_modifytime;
	private String role_code;
	private String sys_id;
	private String sys_name;
	private String role_addtimestr;
	private String role_modifytimestr;
	private String role_addname;
	private String role_modifyname;

	public Role(String role_name) {
		super();
		this.role_name = role_name;
	}

	public String getSys_name() {
		return sys_name;
	}

	public void setSys_name(String sys_name) {
		this.sys_name = sys_name;
	}

	public String getRole_addtimestr() {

		if (null != role_addtime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.role_addtimestr = sdf.format(role_addtime);
		}

		return role_addtimestr;
	}

	public void setRole_addtimestr(String role_addtimestr) {
		this.role_addtimestr = role_addtimestr;
	}

	public String getRole_modifytimestr() {

		if (null != role_modifytime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.role_modifytimestr = sdf.format(role_modifytime);
		}

		return role_modifytimestr;
	}

	public void setRole_modifytimestr(String role_modifytimestr) {
		this.role_modifytimestr = role_modifytimestr;
	}

	public Role() {
		super();
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_description() {
		return role_description;
	}

	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}

	public String getRole_delflag() {
		if (null == role_delflag || role_delflag.isEmpty()) {
			role_delflag = "1";
		}
		return role_delflag;
	}

	public void setRole_delflag(String role_delflag) {
		this.role_delflag = role_delflag;
	}

	public String getRole_addby() {
		return role_addby;
	}

	public void setRole_addby(String role_addby) {
		this.role_addby = role_addby;
	}

	public Date getRole_addtime() {
		return role_addtime;
	}

	public void setRole_addtime(Date role_addtime) {
		this.role_addtime = role_addtime;
	}

	public String getRole_modifyby() {
		return role_modifyby;
	}

	public void setRole_modifyby(String role_modifyby) {
		this.role_modifyby = role_modifyby;
	}

	public Date getRole_modifytime() {
		return role_modifytime;
	}

	public void setRole_modifytime(Date role_modifytime) {
		this.role_modifytime = role_modifytime;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getSys_id() {
		return sys_id;
	}

	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}

	public String getRole_addname() {
		return role_addname;
	}

	public void setRole_addname(String role_addname) {
		this.role_addname = role_addname;
	}

	public String getRole_modifyname() {
		return role_modifyname;
	}

	public void setRole_modifyname(String role_modifyname) {
		this.role_modifyname = role_modifyname;
	}

}
