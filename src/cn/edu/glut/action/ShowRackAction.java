package cn.edu.glut.action;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.glut.entity.Book;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowRackAction extends ActionSupport {

	private ReadService readservice;

	public void ShowRackBook() {
		int userid = 4;
		List<Book> list = readservice.getAllRackBook(userid);

	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

}
