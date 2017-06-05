package cn.edu.glut.action;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.AuthorService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AuthorAction extends ActionSupport implements ModelDriven<User>{
	
	private AuthorService authorService;
	public void setAuthorService(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	public String login(){
		User existUser = (User) authorService.login(user);
		if(existUser==null){
			this.addActionError("登录失败,用户名或密码错误");
			return "loginfailed";      
		}else{
			//将用户信息存入session中
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return "loginsuccess";
		}
	}
	
	//注册
	public String register(){
		if(authorService.addUser(user)==true){
			return "registersuccess";
		}else{
			this.addActionError("注册失败，用户名或邮箱地址已存在");
			return "registerfailed";
		}
	}
	
}
