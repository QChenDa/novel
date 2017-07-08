package cn.edu.glut.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowRackAction extends ActionSupport {

	private ReadService readservice;
	private List<Book> list=null;

	User user =(User)ServletActionContext.getRequest().getSession().getAttribute("user");
	
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public String ShowRackBook() {
		System.out.println(user.getUserId());
		 list = readservice.getAllRackBook(user.getUserId());
		 System.out.println("000000000000000000000000");
		 if(!list.isEmpty())
			 return "showrackbooksuccess";
		 else
			 return "showrackbookfail";
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}
	
	
}
