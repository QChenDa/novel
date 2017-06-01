package cn.edu.glut.entity;

import cn.edu.glut.entity.User;

/**
 * AbstractUserrights entity provides the base persistence definition of the
 * Userrights entity. @author MyEclipse Persistence Tools
 */

public class Userrights  {

	// Fields

	private Integer userId;
	private User user;
	private String userType;
	private Integer userGrade;

	// Constructors

	/** default constructor */
	public Userrights() {
	}

	/** minimal constructor */
	public Userrights(Integer userId, User user) {
		this.userId = userId;
		this.user = user;
	}

	/** full constructor */
	public Userrights(Integer userId, User user, String userType,
			Integer userGrade) {
		this.userId = userId;
		this.user = user;
		this.userType = userType;
		this.userGrade = userGrade;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserGrade() {
		return this.userGrade;
	}

	public void setUserGrade(Integer userGrade) {
		this.userGrade = userGrade;
	}

}