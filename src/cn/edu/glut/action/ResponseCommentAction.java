package cn.edu.glut.action;

import java.util.Date;

import javax.annotation.Resource;

import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class ResponseCommentAction extends ActionSupport {

	private ReadService readservice;
	Comment comment;

	public void TextResponse() {
		comment = new Comment();
		User user = new User(4,"jkh","uu","ji") ;
		comment.setUser(user);
		comment.setCommentTitle("adfsa");
		comment.setCommentText("sdfg");
		readservice.AddComment(comment);
	}

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
}
