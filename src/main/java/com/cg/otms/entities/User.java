package com.cg.otms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private Long userId;
	private String UserName;
	@OneToOne
	@JoinColumn(name="user_h1")
	private Test userTest;
	private Boolean isAdmin;
    private String userPassword;  
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", userTest=" + userTest + ", Admin=" + isAdmin
				+ ", userPassword=" + userPassword + "]";
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Test getUserTest() {
		return userTest;
	}
	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}
	public Boolean getAdmin() {
		return isAdmin;
	}
	public void setAdmin(Boolean admin) {
		isAdmin = admin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public User(Long userId, String userName, Test userTest, Boolean admin, String userPassword) {
		super();
		this.userId = userId;
		this.UserName = userName;
		this.userTest = userTest;
		this.isAdmin = admin;
		this.userPassword = userPassword;
	}
	

}
