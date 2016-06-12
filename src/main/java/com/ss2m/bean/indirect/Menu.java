package com.ss2m.bean.indirect;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu implements Serializable {
	private static final long serialVersionUID = -8254768760047199748L;

	private String menu_id;// 菜单标识号
	private String menu_name;// 菜单名称
	private String menu_parentid;// 父菜单标识
	private String menu_endflag;// 是否叶子节点菜单
	private String menu_rank_no;// 菜单排序值
	private String menu_delflag;// 删除标志
	private String menu_addby;// 添加人
	private String menu_addname;// 菜单添加人
	private Date menu_addtime;// 添加时间
	private String menu_addtimestr;// 显示添加时间
	private String menu_modifyby;// 修改人
	private String menu_modifyname;// 菜单修改人
	private Date menu_modifytime;// 修改时间
	private String menu_modifytimestr;// 显示修改时间
	private String menu_description;// 菜单描述
	private String menu_url;// 菜单链接
	private String menu_icon;// 菜单图标

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_parentid() {
		return menu_parentid;
	}

	public void setMenu_parentid(String menu_parentid) {
		this.menu_parentid = menu_parentid;
	}

	public String getMenu_endflag() {
		return menu_endflag;
	}

	public void setMenu_endflag(String menu_endflag) {
		this.menu_endflag = menu_endflag;
	}

	public String getMenu_rank_no() {
		return menu_rank_no;
	}

	public void setMenu_rank_no(String menu_rank_no) {
		this.menu_rank_no = menu_rank_no;
	}

	public String getMenu_delflag() {
		return menu_delflag;
	}

	public void setMenu_delflag(String menu_delflag) {
		this.menu_delflag = menu_delflag;
	}

	public Date getMenu_addtime() {
		return menu_addtime;
	}

	public void setMenu_addtime(Date menu_addtime) {
		this.menu_addtime = menu_addtime;
	}

	public Date getMenu_modifytime() {
		return menu_modifytime;
	}

	public void setMenu_modifytime(Date menu_modifytime) {
		this.menu_modifytime = menu_modifytime;
	}

	public String getMenu_addtimestr() {
		if (null != menu_addtime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.menu_addtimestr = sdf.format(this.menu_addtime);
		}

		return menu_addtimestr;
	}

	public void setMenu_modifytimestr(String menu_modifytimestr) {
		this.menu_modifytimestr = menu_modifytimestr;
	}

	public String getMenu_modifytimestr() {
		if (null != menu_modifytime) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			this.menu_modifytimestr = sdf.format(this.menu_modifytime);
		}

		return menu_modifytimestr;
	}

	public void setMenu_addtimestr(String menu_addtimestr) {
		this.menu_addtimestr = menu_addtimestr;
	}

	public String getMenu_addname() {
		return menu_addname;
	}

	public void setMenu_addname(String menu_addname) {
		this.menu_addname = menu_addname;
	}

	public String getMenu_addby() {
		return menu_addby;
	}

	public void setMenu_addby(String menu_addby) {
		this.menu_addby = menu_addby;
	}

	public String getMenu_modifyby() {
		return menu_modifyby;
	}

	public void setMenu_modifyby(String menu_modifyby) {
		this.menu_modifyby = menu_modifyby;
	}

	public String getMenu_modifyname() {
		return menu_modifyname;
	}

	public void setMenu_modifyname(String menu_modifyname) {
		this.menu_modifyname = menu_modifyname;
	}

	public String getMenu_description() {
		return menu_description;
	}

	public void setMenu_description(String menu_description) {
		this.menu_description = menu_description;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}

	public String getMenu_icon() {
		return menu_icon;
	}

	public void setMenu_icon(String menu_icon) {
		this.menu_icon = menu_icon;
	}
}
