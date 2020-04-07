package com.chap61.domain;
/**
 * POJO类，和数据库里的Users表的字段一致 
 * @author Administrator
 *
 */
public class Users {
	private int id;
	private String loginId;
	private String loginPwd;
	private String name;
	private String address;
	private String phone;
	private String mail;
	private int userRoleId;
	private int userStateId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public int getUserStateId() {
		return userStateId;
	}
	public void setUserStateId(int userStateId) {
		this.userStateId = userStateId;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", loginId=" + loginId + ", loginPwd="
				+ loginPwd + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", mail=" + mail + ", userRoleId="
				+ userRoleId + ", userStateId=" + userStateId + "]";
	}
}
