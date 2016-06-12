package com.ss2m.bean.indirect;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Req implements Serializable {
	private static final long serialVersionUID = 1L;

	private String req_id;
	private String req_name;
	private String req_url;
	private String req_description;
	private String menu_id;
	private String menu_name;
	private String req_addby;
	private String req_addname;
	private Date req_addtime;
	private String req_addtimestr;
	private Date req_modifytime;
	private String req_modifytimestr;
	private String req_modifyby;
	private String req_modifyname;
	private String req_delflag;

	public Req(String req_id, String req_name, String req_url, String req_description, String menu_id, String req_addby, Date req_addtime, Date req_modifytime, String req_modifyby) {
		super();
		this.req_id = req_id;
		this.req_name = req_name;
		this.req_url = req_url;
		this.req_description = req_description;
		this.menu_id = menu_id;
		this.req_addby = req_addby;
		this.req_addtime = req_addtime;
		this.req_modifytime = req_modifytime;
		this.req_modifyby = req_modifyby;
	}

	public Req() {
		super();
	}

	public String getReq_delflag() {
		if (null == req_delflag || req_delflag.isEmpty()) {
			this.req_delflag = "1";
		}
		return req_delflag;
	}

	public void setReq_delflag(String req_delflag) {
		this.req_delflag = req_delflag;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getReq_id() {
		return req_id;
	}

	public void setReq_id(String req_id) {
		this.req_id = req_id;
	}

	public String getReq_name() {
		return req_name;
	}

	public void setReq_name(String req_name) {
		this.req_name = req_name;
	}

	public String getReq_url() {
		return req_url;
	}

	public void setReq_url(String req_url) {
		this.req_url = req_url;
	}

	public String getReq_description() {
		return req_description;
	}

	public void setReq_description(String req_description) {
		this.req_description = req_description;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getReq_addby() {
		return req_addby;
	}

	public void setReq_addby(String req_addby) {
		this.req_addby = req_addby;
	}

	public Date getReq_addtime() {
		return req_addtime;
	}

	public void setReq_addtime(Date req_addtime) {
		this.req_addtime = req_addtime;
	}

	public String getReq_addtimestr() {
		if (null != req_addtime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.req_addtimestr = sdf.format(req_addtime);
		}
		return req_addtimestr;
	}

	public Date getReq_modifytime() {
		return req_modifytime;
	}

	public void setReq_modifytime(Date req_modifytime) {
		this.req_modifytime = req_modifytime;
	}

	public String getReq_modifytimestr() {
		if (null != req_modifytime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.req_modifytimestr = sdf.format(req_modifytime);
		}
		return req_modifytimestr;
	}

	public String getReq_modifyby() {
		return req_modifyby;
	}

	public void setReq_modifyby(String req_modifyby) {
		this.req_modifyby = req_modifyby;
	}

	public String getReq_addname() {
		return req_addname;
	}

	public void setReq_addname(String req_addname) {
		this.req_addname = req_addname;
	}

	public String getReq_modifyname() {
		return req_modifyname;
	}

	public void setReq_modifyname(String req_modifyname) {
		this.req_modifyname = req_modifyname;
	}

	public void setReq_addtimestr(String req_addtimestr) {
		this.req_addtimestr = req_addtimestr;
	}

	public void setReq_modifytimestr(String req_modifytimestr) {
		this.req_modifytimestr = req_modifytimestr;
	}

}
