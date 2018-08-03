package com.haomostudio.SpringMVCTemplate.common.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author wugz
 * @email wugz1@yusys.com.cn
 * @date 2018-08-02 19:40:15
 */
public class HmUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String id;
	//
	private String username;
	//
	private String loginid;
	//
	private String password;
	//
	private String mobile;
	//
	private String email;
	//
	private String avatar;
	//
	private Date createTime;
	//
	private Date lastUpdateTime;
	//
	private Date lastLoginTime;
	//
	private String departmentCode;
	//
	private String roleId;
	//????ǰ?೤ʱ?䷢???????
	private Integer meetingRemindingTime;
	//
	private String jobTitle;
	//
	private String phoneNumber;
	//
	private String phoneNumberSpare;
	//
	private Integer rank;
	//
	private String community;
	//false???????? Ĭ????false, true???
	private String enable;
	//Ĭ???ǲ????أ?Ĭ????false,   true?????
	private String hide;
	//
	private String departmentId;
	//
	private String code;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	/**
	 * 获取：
	 */
	public String getLoginid() {
		return loginid;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * 获取：
	 */
	public String getAvatar() {
		return avatar;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/**
	 * 获取：
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	/**
	 * 设置：
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * 获取：
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * 设置：
	 */
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	/**
	 * 获取：
	 */
	public String getDepartmentCode() {
		return departmentCode;
	}
	/**
	 * 设置：
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * 设置：????ǰ?೤ʱ?䷢???????
	 */
	public void setMeetingRemindingTime(Integer meetingRemindingTime) {
		this.meetingRemindingTime = meetingRemindingTime;
	}
	/**
	 * 获取：????ǰ?೤ʱ?䷢???????
	 */
	public Integer getMeetingRemindingTime() {
		return meetingRemindingTime;
	}
	/**
	 * 设置：
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * 获取：
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * 设置：
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 获取：
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 设置：
	 */
	public void setPhoneNumberSpare(String phoneNumberSpare) {
		this.phoneNumberSpare = phoneNumberSpare;
	}
	/**
	 * 获取：
	 */
	public String getPhoneNumberSpare() {
		return phoneNumberSpare;
	}
	/**
	 * 设置：
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * 获取：
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * 设置：
	 */
	public void setCommunity(String community) {
		this.community = community;
	}
	/**
	 * 获取：
	 */
	public String getCommunity() {
		return community;
	}
	/**
	 * 设置：false???????? Ĭ????false, true???
	 */
	public void setEnable(String enable) {
		this.enable = enable;
	}
	/**
	 * 获取：false???????? Ĭ????false, true???
	 */
	public String getEnable() {
		return enable;
	}
	/**
	 * 设置：Ĭ???ǲ????أ?Ĭ????false,   true?????
	 */
	public void setHide(String hide) {
		this.hide = hide;
	}
	/**
	 * 获取：Ĭ???ǲ????أ?Ĭ????false,   true?????
	 */
	public String getHide() {
		return hide;
	}
	/**
	 * 设置：
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * 获取：
	 */
	public String getDepartmentId() {
		return departmentId;
	}
	/**
	 * 设置：
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：
	 */
	public String getCode() {
		return code;
	}
}
