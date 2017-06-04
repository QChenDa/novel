package cn.edu.glut.action;

import java.util.List;

import javax.annotation.Resource;

import cn.edu.glut.entity.Chapter;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class CatalogAction extends ActionSupport{
	
			@Resource(name="readservice")
			private	ReadService readservice;
			
			public String ObtainCatalog(){
				String BookName=null;
				
				List<Chapter> chapters = readservice.getAllChapter(BookName);
					if(chapters.isEmpty())
						return "obtainCatalogfail";
					else
						return "obtainCatalogsuccess";
			}
}
