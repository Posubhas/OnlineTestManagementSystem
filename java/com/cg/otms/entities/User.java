package com.cg.otms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	private int userId;
	private String UserName;
	private String userPassword;
	private String userRole;

	@OneToOne
	@JoinColumn(name = "user_h1")
	private Test userTest;

	public User() {
		super();

	}

	public User(int userId, String userName, String userPassword, String userRole, Test userTest) {
		super();
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userTest = userTest;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", userPassword=" + userPassword + ", userRole="
				+ userRole + ", userTest=" + userTest + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Test getUserTest() {
		return userTest;
	}

	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}

}