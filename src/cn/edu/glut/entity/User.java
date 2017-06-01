package cn.edu.glut.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public class User  {

	// Fields

	private Integer userId;
	private String userName;
	private String userPw;
	private String userEmali;
	private Set books = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set bookRacks = new HashSet(0);
	private Set userrightses = new HashSet(0);
	private Set userprofiles = new HashSet(0);
	private Set votes = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId, String userName, String userPw,
			String userEmali) {
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.userEmali = userEmali;
	}

	/** full constructor */
	public User(Integer userId, String userName, String userPw,
			String userEmali, Set books, Set comments, Set bookRacks,
			Set userrightses, Set userprofiles, Set votes) {
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.userEmali = userEmali;
		this.books = books;
		this.comments = comments;
		this.bookRacks = bookRacks;
		this.userrightses = userrightses;
		this.userprofiles = userprofiles;
		this.votes = votes;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getUserEmali() {
		return this.userEmali;
	}

	public void setUserEmali(String userEmali) {
		this.userEmali = userEmali;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getBookRacks() {
		return this.bookRacks;
	}

	public void setBookRacks(Set bookRacks) {
		this.bookRacks = bookRacks;
	}

	public Set getUserrightses() {
		return this.userrightses;
	}

	public void setUserrightses(Set userrightses) {
		this.userrightses = userrightses;
	}

	public Set getUserprofiles() {
		return this.userprofiles;
	}

	public void setUserprofiles(Set userprofiles) {
		this.userprofiles = userprofiles;
	}

	public Set getVotes() {
		return this.votes;
	}

	public void setVotes(Set votes) {
		this.votes = votes;
	}

}