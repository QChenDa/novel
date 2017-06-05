package cn.edu.glut.action;

import java.util.List;

import org.apache.logging.log4j.core.Logger;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class CatalogAction extends ActionSupport {

	private ReadService readservice;

	public String ObtainCatalog() {
		Book book = new Book();
	
		book.setBookId(3);
		List<Chapter> chapters = readservice.getAllChapter(book);
		if (!chapters.isEmpty())
		{
			System.out.println("obtainCatalogsuccess");
			return "obtainCatalogsuccess";
		}
		else
		{
			System.out.println("obtainCatalogfail");
			return "obtainCatalogfail";
		}
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}
}
