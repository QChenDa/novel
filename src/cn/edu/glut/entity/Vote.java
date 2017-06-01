package cn.edu.glut.entity;

import java.util.Date;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.User;

/**
 * AbstractVote entity provides the base persistence definition of the Vote
 * entity. @author MyEclipse Persistence Tools
 */

public  class Vote  {

	// Fields

	private Integer tickyId;
	private Book book;
	private User user;
	private Integer amount;
	private Date time;
	private Integer ticketPrice;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** minimal constructor */
	public Vote(Integer tickyId, Book book, User user) {
		this.tickyId = tickyId;
		this.book = book;
		this.user = user;
	}

	/** full constructor */
	public Vote(Integer tickyId, Book book, User user, Integer amount,
			Date time, Integer ticketPrice) {
		this.tickyId = tickyId;
		this.book = book;
		this.user = user;
		this.amount = amount;
		this.time = time;
		this.ticketPrice = ticketPrice;
	}

	// Property accessors

	public Integer getTickyId() {
		return this.tickyId;
	}

	public void setTickyId(Integer tickyId) {
		this.tickyId = tickyId;
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

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getTicketPrice() {
		return this.ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}