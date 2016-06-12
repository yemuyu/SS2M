package com.ss2m.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/*import com.spdb.ib.dpib.logs.LogManager;
import com.spdb.stas.beans.Constant;
import com.spdb.stas.indirect.UserToken;
*/

/**
 * BasicAction继承ActionSupport,把java对象转换为json对象
 * 系统中其他Action均继承自此类
 * @author yemuyu
 *
 */
public class BasicAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HttpServletRequest request;
	public HttpServletResponse response;
	public Map<String, Object> session;

	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 */
	public void writeJsonObject(Object object) {
		try {
			JSONObject json = (JSONObject)JSONObject
					.fromObject(object);
			ServletActionContext.getResponse().setContentType(
					"text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter()
					.write(json.toString());
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			//LogManager.errorOri("将对象转换成JSON字符串失败！", e);
		}
	}

	/**
	 * 将数组转换成JSON字符串，并响应回前台
	 * 
	 */
	public void writeJsonArray(Object object) {
		try {
			JSONArray json = (JSONArray) JSONArray
					.fromObject(object);
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			if(json != null){
				ServletActionContext.getResponse().getWriter().write(json.toString());
			}
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			//LogManager.errorOri("将数组转换成JSON字符串失败！", e);
		}
	}

	/**
	 * 前台返回字符串
	 * 
	 */
	public void writeString(String str) {
		try {
			ServletActionContext.getResponse().setContentType(
					"text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(str);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			//LogManager.errorOri("处理字符串失败！", e);
		}
	}

	/*
	 * 获取用户登录信息
	 */
	/*public UserToken getUserToken() {
		return (UserToken) session.get(Constant.LOGIN_USER_TOKEN);
	}*/

	/**
	 * 接口ServletRequestAware的方法,实现此接口可获得servletRequest
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

}
