package com.ss2m.bean.indirect;

import java.io.Serializable;

public class UserToken implements Serializable {

	/**
	 * UserToken类 用户登录系统后 记录当前用户的登录信息
	 */
	private Long userId;// 用户ID
	private String organId;// 机构ID
	private String userName;// 用户名称
	private String userLoginName;// 用户登录名
	private String userStatus;//用户有效标志位
	private int failCnt;//用户密码失败次数
	private String userPassword;//用户密码
	// private Long keyNum;// 证书ID
	private String sysId;// 系统ID
	private String sysCode;// 系统代码
	private String reqIp;// 请求机器IP
	private Long loginID; // 登录ID
	private String lastLoginTime; // 上次登录时间
	private String pwd_time;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOrganId() {
		return organId;
	}

	public void setOrganId(String organId) {
		this.organId = organId;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getReqIp() {
		return reqIp;
	}

	public void setReqIp(String reqIp) {
		this.reqIp = reqIp;
	}
	
	public Long getLoginID() {
		return loginID;
	}

	public void setLoginID(Long loginID) {
		this.loginID = loginID;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getFailCnt() {
		return failCnt;
	}

	public void setFailCnt(int failCnt) {
		this.failCnt = failCnt;
	}

	public String getPwd_time() {
		return pwd_time;
	}

	public void setPwd_time(String pwd_time) {
		this.pwd_time = pwd_time;
	}
}
