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


@Component("AddBookToRackAction")
public class AddBookToRackAction extends ActionSupport{
				
				@Resource(name="readservice")
				private	ReadService readservice;
				
				public void AddBook() {
					
					User user = new User()  ;
					user.setUserName("asdfda");
					Book book = new Book();
					book.setBookName("sss");
					
					BookRack bookrack = new BookRack();
					bookrack.setBook(book);
					book.setUser(user);
					readservice.AddBookToRack(bookrack);
				
				}
}
