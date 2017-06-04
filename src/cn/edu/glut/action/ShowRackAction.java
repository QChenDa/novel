package cn.edu.glut.action;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.glut.entity.Book;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowRackAction extends ActionSupport{	
				
				@Resource(name="readservice")
				private	ReadService readservice;
				
				public void ShowRackBook() {
					String username=null;
					List<Book> list = readservice.getAllRackBook(username);
					
				}

}
