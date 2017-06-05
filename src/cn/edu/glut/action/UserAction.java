package cn.edu.glut.action;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	//注入Service
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private User user = new User();
	//封装表单数据
	@Override
	public User getModel() {
		return  user;
	}
	
	
	//登录
	public String login(){
		User existUser = (User) userService.login(user);
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
		if(userService.addUser(user)==true){
			return "registersuccess";
		}else{
			this.addActionError("注册失败，用户名或邮箱地址已存在");
			return "registerfailed";
		}
	}
	
/*	//添加用户
	public String addUser(){
		userService.addUser(user);
		return SUCCESS;
	}*/
	
	//删除用户
/*	public String deleteUser(){
		
		return SUCCESS;
	}*/
	
/*	//修改用户
	public String updateUser(){
		return SUCCESS;
	}*/
	
}
