package cn.edu.glut.entity;

import java.util.Date;

import cn.edu.glut.entity.Book;

/**
 * AbstractChapter entity provides the base persistence definition of the
 * Chapter entity. @author MyEclipse Persistence Tools
 */

public class Chapter  {

	// Fields

	private Integer chapterId;
	private Integer book;
	private String title;
	private String textUrl;
	private Date editTime;

	// Constructors

	/** default constructor */
	public Chapter() {
	}

	/** full constructor */
	public Chapter(Integer book, String title, String textUrl,
			Date editTime) {
		this.book = book;
		this.title = title;
		this.textUrl = textUrl;
		this.editTime = editTime;
	}

	// Property accessors

	public Integer getChapterId() {
		return this.chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}

	public Integer getBook() {
		return this.book;
	}

	public void setBook(Integer book) {
		this.book = book;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTextUrl() {
		return this.textUrl;
	}

	public void setTextUrl(String textUrl) {
		this.textUrl = textUrl;
	}

	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

}