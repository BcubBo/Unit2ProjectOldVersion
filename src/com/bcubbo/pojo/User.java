package com.bcubbo.pojo;

import java.util.Date;

public class User {
	
	private  int id,gender,userType,createBy,modifyBy;
	//用户id

	//性别
	//用户类别
	//创建者
	//更新者
	private  String userCode,userName,userPassword,phone,address;
	//用户编码
	//用户名称
	//用户密码
	//电话
	//地址
	//经验教训：setter和gettter一定要和字段名称一致
	private  Date bornDate,creationDate,modifyDate;
	//出生日期
	//创建时间
	//更新时间
	private int age;

	


	public int getAge() {
		/*long time = System.currentTimeMillis()-bornDate.getTime();
		int age = Long.valueOf(time/365/24/60/60/1000).intValue();
		方法1
		*/
		//方法二
		Date currentDate = new Date();
		int currentYear = currentDate.getYear();
		int bornYear = bornDate.getYear();
		this.age = currentYear - bornYear;
		return this.age ;
	}
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
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
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
