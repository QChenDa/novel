package cn.edu.glut.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import cn.edu.glut.entity.User;

/**
 * AbstractComment entity provides the base persistence definition of the
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment  {

	// Fields

	private Integer commentId;
	private User user;
	private String commentTitle;
	private Date commentTime;
	private String commentText;
	private Set parentChildrensForParentId = new HashSet(0);
	private Set parentChildrensForChildrenId = new HashSet(0);

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(User user, String commentTitle, Date commentTime,
			String commentText) {
		this.user = user;
		this.commentTitle = commentTitle;
		this.commentTime = commentTime;
		this.commentText = commentText;
	}

	/** full constructor */
	public Comment(User user, String commentTitle, Date commentTime,
			String commentText, Set parentChildrensForParentId,
			Set parentChildrensForChildrenId) {
		this.user = user;
		this.commentTitle = commentTitle;
		this.commentTime = commentTime;
		this.commentText = commentText;
		this.parentChildrensForParentId = parentChildrensForParentId;
		this.parentChildrensForChildrenId = parentChildrensForChildrenId;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommentTitle() {
		return this.commentTitle;
	}

	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
	}

	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public String getCommentText() {
		return this.commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Set getParentChildrensForParentId() {
		return this.parentChildrensForParentId;
	}

	public void setParentChildrensForParentId(Set parentChildrensForParentId) {
		this.parentChildrensForParentId = parentChildrensForParentId;
	}

	public Set getParentChildrensForChildrenId() {
		return this.parentChildrensForChildrenId;
	}

	public void setParentChildrensForChildrenId(Set parentChildrensForChildrenId) {
		this.parentChildrensForChildrenId = parentChildrensForChildrenId;
	}

}