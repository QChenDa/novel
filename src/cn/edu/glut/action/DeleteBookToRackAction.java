package cn.edu.glut.action;

import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteBookToRackAction extends ActionSupport {

	
	private ReadService readservice;

	public void DeleteBook() {
		Book book = new Book();
		User user = new User();
		user.setUserId(4);
		book.setBookId(3);
		BookRack bookrack = new BookRack();
		bookrack.setBookRackId(9);
		bookrack.setBook(book);
		bookrack.setUser(user);
		readservice.DeleteBookToRack(bookrack);
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}
}
