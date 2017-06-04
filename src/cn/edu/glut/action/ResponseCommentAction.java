package cn.edu.glut.action;

import java.util.Date;

import javax.annotation.Resource;

import cn.edu.glut.entity.Comment;
import cn.edu.glut.service.ReadService;

import com.opensymphony.xwork2.ActionSupport;

public class ResponseCommentAction extends ActionSupport{
			
					@Resource(name="readservice")
					private	ReadService readservice;
					Comment comment;

				public void TextResponse(){	
					Date commentTime = new Date();
					comment.setCommentTime(commentTime);
					
					readservice.AddComment(comment);
				}
				
				public Comment getComment() {
					return comment;
				}
				
				public void setComment(Comment comment) {
					this.comment = comment;
				}
}
