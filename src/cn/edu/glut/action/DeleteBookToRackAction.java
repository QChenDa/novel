package cn.edu.glut.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;



import com.opensymphony.xwork2.ActionSupport;


public class DeleteBookToRackAction extends ActionSupport {

	
	private ReadService readservice;
	private Book book;
	private String bookname;
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String DeleteBook() {
			
		HttpSession session=ServletActionContext.getRequest().getSession();
		User user = (User) session.getAttribute("user");
		book=readservice.FindBookByname(bookname);
		System.out.println("------------------------------------------------");
		readservice.DeleteBookToRack(book.getBookId());
		return "success";
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}
}
