package cn.edu.glut.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.core.Logger;
import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class CatalogAction extends ActionSupport {

	private ReadService readservice;
	private List<Chapter> chapters;
	private int bookid;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public List getChapters() {
		return chapters;
	}

	public void setChapters(List chapters) {
		this.chapters = chapters;
	}

	public String ObtainCatalog() {
		System.out.println("22222222222222222"+bookid);
		chapters = readservice.getAllChapter(bookid);
		if (!chapters.isEmpty())
		{
			
			return "obtainCatalogsuccess";
		}
		else
		{
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
