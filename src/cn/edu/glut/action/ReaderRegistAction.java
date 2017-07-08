package cn.edu.glut.action;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserRegistService;
import cn.edu.glut.serviceimpl.UserRegistServiceimpl;

import com.opensymphony.xwork2.ActionSupport;

public class ReaderRegistAction extends ActionSupport{
			 
	private UserRegistServiceimpl userregistservice;
	private User user;

		public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		public UserRegistService getUserregistservice() {
		return userregistservice;
	}

	public void setUserregistservice(UserRegistServiceimpl userregistservice) {
		this.userregistservice = userregistservice;
	}

		public String ReaderRegistAction(){
			
					if(userregistservice.Regist(user))
						return "ReaderRegistAction";
					else
						return "false";
	
		}
		

}
