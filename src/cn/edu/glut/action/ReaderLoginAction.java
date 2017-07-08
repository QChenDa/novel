package cn.edu.glut.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserLoginService;
import cn.edu.glut.serviceimpl.UserLoginServiceimpl;

import com.opensymphony.xwork2.ActionSupport;


public class ReaderLoginAction extends ActionSupport {

	private UserLoginServiceimpl userloginservice;
	private User user; 
	private String username="";
	private String userpw="";


	public UserLoginService getUserloginservice() {
		return userloginservice;
	}

	public void setUserloginservice(UserLoginServiceimpl userloginservice) {
		this.userloginservice = userloginservice;
	}

	public String ReaderLoginAction() {
			
		HttpServletRequest request=ServletActionContext.getRequest();
		username=request.getParameter("username");
		userpw=request.getParameter("userpw");
		System.out.println(userpw);
		if(!userloginservice.Verification(username))
		{
			user=userloginservice.Login(username);
			
			if(userpw.equals(user.getUserPw()))	
			{
				ServletActionContext.getRequest().getSession().setAttribute("user", user);
			 return "ReaderLoginAction";
			}
			else
				return "false";
		}
		else
			return "false";

	}

}
