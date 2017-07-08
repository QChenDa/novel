package cn.edu.glut.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {

	private ReadService readservice;
	private Comment comment;

	public ReadService getReadservice() {
		return readservice;
	}

	public void setReadservice(ReadService readservice) {
		this.readservice = readservice;
	}

	

	public String TextComment() {

		HttpSession session = ServletActionContext.getRequest().getSession();
		User user = (User) session.getAttribute("user");
		System.out.println(comment.getCommentText());
		
		comment.setUser(user);
		readservice.AddComment(comment);
			return "commentsuccess";
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
}
