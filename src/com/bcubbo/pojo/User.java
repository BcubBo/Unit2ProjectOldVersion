package com.bcubbo.pojo;

import java.util.Date;

public class User {
	
	private  int id;
	//用户id
	private  String userCode;
	//用户编码
	private  String userName;
	//用户名称
	private  String userPassword;
	//用户密码
	private  int gender;
	//性别
	private  Date bornDate;
	//出生日期
	private  String phone;
	//电话
	private  String address;
	//地址
	private  int userType;
	//用户类别
	private  int createBy;
	//创建者
	private  Date creationDate;
	//创建时间
	private  int modifyBy;
	//更新者
	private  Date modifyDate;
	//更新时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return bornDate;
	}
	public void setDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getCreateBy() {
		return createBy;
	}
	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	
	
	
}
