package cn.edu.glut.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import cn.edu.glut.entity.User;

/**
 * AbstractBook entity provides the base persistence definition of the Book
 * entity. @author MyEclipse Persistence Tools
 */

public class Book  {

	// Fields

	private Integer bookId;
	private User user;
	private String bookName;
	private String bookType;
	private String chapters;
	private String latestChapter;
	private Integer frequency;
	private Set votes = new HashSet(0);
	private Set chapters_1 = new HashSet(0);
	private Set bookRacks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(User user) {
		this.user = user;
	}

	/** full constructor */
	public Book(User user, String bookName, String bookType,
			String chapters, String latestChapter, Integer frequency,
			Set votes, Set chapters_1, Set bookRacks) {
		this.user = user;
		this.bookName = bookName;
		this.bookType = bookType;
		this.chapters = chapters;
		this.latestChapter = latestChapter;
		this.frequency = frequency;
		this.votes = votes;
		this.chapters_1 = chapters_1;
		this.bookRacks = bookRacks;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return this.bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getChapters() {
		return this.chapters;
	}

	public void setChapters(String chapters) {
		this.chapters = chapters;
	}

	public String getLatestChapter() {
		return this.latestChapter;
	}

	public void setLatestChapter(String latestChapter) {
		this.latestChapter = latestChapter;
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public Set getVotes() {
		return this.votes;
	}

	public void setVotes(Set votes) {
		this.votes = votes;
	}

	public Set getChapters_1() {
		return this.chapters_1;
	}

	public void setChapters_1(Set chapters_1) {
		this.chapters_1 = chapters_1;
	}

	public Set getBookRacks() {
		return this.bookRacks;
	}

	public void setBookRacks(Set bookRacks) {
		this.bookRacks = bookRacks;
	}

}