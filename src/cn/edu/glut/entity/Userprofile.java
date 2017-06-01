package cn.edu.glut.entity;

import cn.edu.glut.entity.User;

/**
 * AbstractUserprofile entity provides the base persistence definition of the
 * Userprofile entity. @author MyEclipse Persistence Tools
 */

public class Userprofile  {

	// Fields

	private Integer userId;
	private User user;
	private String userEmali;
	private String userAddress;
	private Integer userPhone;
	private String userName;
	private String userPw;
	private Integer userBooks;

	// Constructors

	/** default constructor */
	public Userprofile() {
	}

	/** minimal constructor */
	public Userprofile(Integer userId, User user) {
		this.userId = userId;
		this.user = user;
	}

	/** full constructor */
	public Userprofile(Integer userId, User user, String userEmali,
			String userAddress, Integer userPhone, String userName,
			String userPw, Integer userBooks) {
		this.userId = userId;
		this.user = user;
		this.userEmali = userEmali;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userName = userName;
		this.userPw = userPw;
		this.userBooks = userBooks;
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

	public String getUserEmali() {
		return this.userEmali;
	}

	public void setUserEmali(String userEmali) {
		this.userEmali = userEmali;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return this.userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public Integer getUserBooks() {
		return this.userBooks;
	}

	public void setUserBooks(Integer userBooks) {
		this.userBooks = userBooks;
	}

}