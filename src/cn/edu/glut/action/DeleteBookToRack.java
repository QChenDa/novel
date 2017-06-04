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
@Component("DeleteBookToRack")
public class DeleteBookToRack extends ActionSupport {

	@Resource(name = "readservice")
	private ReadService readservice;

	public void DeleteBook() {
		Book book = new Book();
		User user = new User(4,"jkh","uu","ji");
		book.setBookId(3);
		book.setUser(user);
		Set set = book.getBookRacks();
		Iterator<BookRack> it = set.iterator();

		BookRack bookrack=null;
		if (it.hasNext())
			bookrack = it.next();

		readservice.DeleteBookToRack(bookrack);
	}
}
