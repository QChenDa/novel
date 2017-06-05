package cn.edu.glut.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;
import cn.edu.glut.serviceimpl.ReadServiceimpl;

import com.opensymphony.xwork2.ActionSupport;

public class AddBookToRackAction extends ActionSupport {

	private ReadService readservice;

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

	public void AddBook() {

		User user = new User();
		
		user.setUserId(4);
		
		Book book = new Book();
	
		book.setBookId(5);

		BookRack bookrack = new BookRack();
		
		bookrack.setUser(user);
		bookrack.setBook(book);
		readservice.AddBookToRack(bookrack);

	}
}
