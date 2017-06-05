package cn.edu.glut.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.glut.entity.Chapter;
import cn.edu.glut.service.ReadService;

import java.io.FileReader;
import java.io.Reader;;

public class ReadAction extends ActionSupport{
	
	
	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

	private	ReadService readservice;
	
		public String Read(){
			
			Chapter chapter= new Chapter();
			String chapterurl = chapter.getTextUrl();
			String chaptertitle = chapter.getTitle();
			
					File file=null;
					file = new File("E:\\1.txt");						
					Reader in=null;
					char[] chaptercontext = new char[ (int) file.length()];
					
					try {
						in = new FileReader(file);
						in.read(chaptercontext);
						
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						in.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(chaptercontext != null)
					{
						System.out.println("obtainchaptersuccess");
						return "obtainchaptersuccess";
					}
					else
					{
						System.out.println("obtainchapterfail");
						return "obtainchapterfail";
					}
				
			
		}
}
