package com.ss2m.bean.indirect;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sys implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sys_id; // 标识
	private String sys_name;// 系统名
	private String sys_description;// 描述
	private String sys_delflag; // 系统状态
	private String sys_addby;// 添加人
	private Date sys_addtime;// 添加时间
	private String sys_modifyby;// 修改人
	private Date sys_modifytime;// 修改时间
	private String sys_modifytimeStr;
	private String sys_addtimeStr;
	
	
	public Sys() {
		super();
	}
	public String getSys_modifytimeStr() {
		if(null!=sys_modifytime){
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			sys_modifytimeStr=sdf.format(sys_modifytime);
		}
		return sys_modifytimeStr;
	}
	public void setSys_modifytimeStr(String sys_modifytimeStr) {
		this.sys_modifytimeStr = sys_modifytimeStr;
	}
	public String getSys_addtimeStr() {
		if(null!=sys_addtime){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			sys_addtimeStr=sdf.format(sys_addtime);
		}
		 
		return sys_addtimeStr;
	}
	public void setSys_addtimeStr(String sys_addtimeStr) {
		this.sys_addtimeStr = sys_addtimeStr;
	}
	public Sys(String sys_id, String sys_name, String sys_description, String sys_delflag, String sys_addby, Date sys_addtime, String sys_modifyby, Date sys_modifytime) {
		super();
		this.sys_id = sys_id;
		this.sys_name = sys_name;
		this.sys_description = sys_description;
		this.sys_delflag = sys_delflag;
		this.sys_addby = sys_addby;
		this.sys_addtime = sys_addtime;
		this.sys_modifyby = sys_modifyby;
		this.sys_modifytime = sys_modifytime;
	}
	
	
	public Sys(String sys_id, String sys_name) {
		super();
		this.sys_id = sys_id;
		this.sys_name = sys_name;
	}
	public String getSys_id() {
		return sys_id;
	}
	public void setSys_id(String sys_id) {
		this.sys_id = sys_id;
	}
	public String getSys_name() {
		return sys_name;
	}
	public void setSys_name(String sys_name) {
		this.sys_name = sys_name;
	}
	public String getSys_description() {
		return sys_description;
	}
	public void setSys_description(String sys_description) {
		this.sys_description = sys_description;
	}
	public String getSys_delflag() {
		if(null==sys_delflag||sys_delflag.isEmpty()){
			this.sys_delflag="1";
		}
		return sys_delflag;
	}
	public void setSys_delflag(String sys_delflag) {
		this.sys_delflag = sys_delflag;
	}
	public String getSys_addby() {
		return sys_addby;
	}
	public void setSys_addby(String sys_addby) {
		this.sys_addby = sys_addby;
	}
	public Date getSys_addtime() {
		return sys_addtime;
	}
	public void setSys_addtime(Date sys_addtime) {
		this.sys_addtime = sys_addtime;
	}
	public String getSys_modifyby() {
		return sys_modifyby;
	}
	public void setSys_modifyby(String sys_modifyby) {
		this.sys_modifyby = sys_modifyby;
	}
	public Date getSys_modifytime() {
		return sys_modifytime;
	}
	public void setSys_modifytime(Date sys_modifytime) {
		this.sys_modifytime = sys_modifytime;
	}

	
}
