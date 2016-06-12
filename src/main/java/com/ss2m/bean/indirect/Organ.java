package com.ss2m.bean.indirect;

import java.io.Serializable;


public class Organ implements Serializable {
	private static final long serialVersionUID = 6887698426997786000L;
	private String organ_id; // 机构标识号
	private String organ_name; // 机构名
	private String parent_organ_id; // 上级机构
	private String busi_organ_id; // 交易机构
	private String organ_path; // 机构全路径
	private String country_code; // 国家代码
	private String organ_type; // 机构类型;O-其它;H-总行;S-子分行;E-二级分行;P-网点;B-分行;D-部门'
	private String organ_busi_type; // 机构业务类别
	private String organ_busi_property; // 机构业务属性
	private String organ_caregory; // 机构类别
	private String organ_desc; // 描述
	private String organ_status; // 机构状态（A激活，D删除）
	private String sys_id;
	private String sys_name;
	private String organ_addname;
	private String organ_addtimestr;
	private String organ_modifyname;
	private String organ_modifytimestr;

	public Organ(String organ_name) {
		super();
		this.organ_name = organ_name;
	}

	public Organ() {
		super();
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

	public String getParent_organ_id() {
		return parent_organ_id;
	}

	public void setParent_organ_id(String parent_organ_id) {
		this.parent_organ_id = parent_organ_id;
	}

	public String getBusi_organ_id() {
		return busi_organ_id;
	}

	public void setBusi_organ_id(String busi_organ_id) {
		this.busi_organ_id = busi_organ_id;
	}

	public String getOrgan_path() {
		return organ_path;
	}

	public void setOrgan_path(String organ_path) {
		this.organ_path = organ_path;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getOrgan_type() {
		return organ_type;
	}

	public void setOrgan_type(String organ_type) {
		this.organ_type = organ_type;
	}

	public String getOrgan_busi_type() {
		return organ_busi_type;
	}

	public void setOrgan_busi_type(String organ_busi_type) {
		this.organ_busi_type = organ_busi_type;
	}

	public String getOrgan_busi_property() {
		return organ_busi_property;
	}

	public void setOrgan_busi_property(String organ_busi_property) {
		this.organ_busi_property = organ_busi_property;
	}

	public String getOrgan_caregory() {
		return organ_caregory;
	}

	public void setOrgan_caregory(String organ_caregory) {
		this.organ_caregory = organ_caregory;
	}

	public String getOrgan_desc() {
		return organ_desc;
	}

	public void setOrgan_desc(String organ_desc) {
		this.organ_desc = organ_desc;
	}

	public String getOrgan_status() {
		if (null == organ_status || organ_status.isEmpty()) {
			organ_status = "1";
		}
		return organ_status;
	}

	public void setOrgan_status(String organ_status) {
		this.organ_status = organ_status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public String getOrgan_addname() {
		return organ_addname;
	}

	public void setOrgan_addname(String organ_addname) {
		this.organ_addname = organ_addname;
	}

	public String getOrgan_addtimestr() {
		return organ_addtimestr;
	}

	public void setOrgan_addtimestr(String organ_addtimestr) {
		this.organ_addtimestr = organ_addtimestr;
	}

	public String getOrgan_modifyname() {
		return organ_modifyname;
	}

	public void setOrgan_modifyname(String organ_modifyname) {
		this.organ_modifyname = organ_modifyname;
	}

	public String getOrgan_modifytimestr() {
		return organ_modifytimestr;
	}

	public void setOrgan_modifytimestr(String organ_modifytimestr) {
		this.organ_modifytimestr = organ_modifytimestr;
	}

}
