package cn.edu.glut.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import cn.edu.glut.entity.Chapter;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

;

public class ReadAction extends ActionSupport {

	private String title;
	private char[] chaptercontext;
	private int chapterId;

	
	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public char[] getChaptercontext() {
		return chaptercontext;
	}

	public void setChaptercontext(char[] chaptercontext) {
		this.chaptercontext = chaptercontext;
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

	private ReadService readservice;

	public String Read() {

		Chapter chapter = readservice.FindChapterByName(title);
		String chapterurl = chapter.getTextUrl();
		String chaptertitle = chapter.getTitle();
		chapterId=chapter.getBook().getBookId();
		System.out.println("111111111111111111111"+chapterId);
		
		File file = null;
		file = new File(chapterurl);		
		chaptercontext = new char[(int) file.length()];
		InputStreamReader isr = null;
		try {
			
			isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			isr.read(chaptercontext);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			isr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (chaptercontext != null) {
			System.out.println("obtainchaptersuccess");
			return "obtainchaptersuccess";
		} else {
			System.out.println("obtainchapterfail");
			return "obtainchapterfail";
		}

	}
}
