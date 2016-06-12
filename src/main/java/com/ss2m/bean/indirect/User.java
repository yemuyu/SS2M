package com.ss2m.bean.indirect;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

	private String user_id;// 用户标识号
	private String user_loginname;// 登录名（登录名保证在同一系统下无重复）
	private String user_username;// 用户名
	private String organ_id;//机构id
	private String organ_name;//机构名
	private String user_password;// 登陆密码
	private String user_status;// 用户状态̬
	private String last_login_time;// 最后登陆时间
	private String sys_id;// 用户所属系统标识
	private String user_delflag;// 删除标志
	private Long user_addby;// 添加人
	private Date user_addtime;// 添加时间
	private String user_displayTime;// 显示添加 时间
	private Long user_modifyby;// 修改人
	private Date user_modifytime;// 修改时间
	private String user_addname;// 添加人姓名
	private String sys_name;// 系统名称
	private int fail_cnt; //密码失次数
	private String pwd_time;//密码过期日期


	public String getUser_displayTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if (null != this.user_addtime) {
			this.user_displayTime = sdf.format(this.user_addtime);
		} else {
			this.user_displayTime = null;
		}
		return user_displayTime;
	}

	public void setUser_displayTime(String user_displayTime) {
		this.user_displayTime = user_displayTime;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_addname() {
		return user_addname;
	}

	public void setUser_addname(String user_addname) {
		this.user_addname = user_addname;
	}

	public String getSys_name() {
		return sys_name;
	}

	public void setSys_name(String sys_name) {
		this.sys_name = sys_name;
	}

	public String getUser_loginname() {
		return user_loginname;
	}

	public void setUser_loginname(String user_loginname) {
		this.user_loginname = user_loginname;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public String getSys_id() {
		return sys_id;
	}

	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}

	public String getUser_delflag() {
		return user_delflag;
	}

	public void setUser_delflag(String user_delflag) {
		this.user_delflag = user_delflag;
	}

	public Long getUser_addby() {
		return user_addby;
	}

	public void setUser_addby(Long user_addby) {
		this.user_addby = user_addby;
	}

	public Long getUser_modifyby() {
		return user_modifyby;
	}

	public void setUser_modifyby(Long user_modifyby) {
		this.user_modifyby = user_modifyby;
	}


	public Date getUser_addtime() {
		return user_addtime;
	}

	public void setUser_addtime(Date user_addtime) {
		this.user_addtime = user_addtime;
	}

	public Date getUser_modifytime() {
		return user_modifytime;
	}

	public void setUser_modifytime(Date user_modifytime) {
		this.user_modifytime = user_modifytime;
	}

	public String getOrgan_id() {
		return organ_id;
	}

	public void setOrgan_id(String organ_id) {
		this.organ_id = organ_id;
	}

	public String getOrgan_name() {
		return organ_name;
	}

	public void setOrgan_name(String organ_name) {
		this.organ_name = organ_name;
	}

	public String getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}

	public int getFail_cnt() {
		return fail_cnt;
	}

	public void setFail_cnt(int fail_cnt) {
		this.fail_cnt = fail_cnt;
	}

	public String getPwd_time() {
		return pwd_time;
	}

	public void setPwd_time(String pwd_time) {
		this.pwd_time = pwd_time;
	}

	
}

