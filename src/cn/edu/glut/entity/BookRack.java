package cn.edu.glut.entity;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.User;

/**
 * AbstractBookRack entity provides the base persistence definition of the
 * BookRack entity. @author MyEclipse Persistence Tools
 */

public class BookRack  {

	// Fields

	private Integer bookRackId;
	private Book book;
	private User user;

	// Constructors

	/** default constructor */
	public BookRack() {
	}

	/** full constructor */
	public BookRack(Book book, User user) {
		this.book = book;
		this.user = user;
	}

	// Property accessors

	public Integer getBookRackId() {
		return this.bookRackId;
	}

	public void setBookRackId(Integer bookRackId) {
		this.bookRackId = bookRackId;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}