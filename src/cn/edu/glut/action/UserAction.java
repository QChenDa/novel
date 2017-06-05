package cn.edu.glut.action;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	//ע��Service
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private User user = new User();
	//��װ������
	@Override
	public User getModel() {
		return  user;
	}
	
	
	//��¼
	public String login(){
		User existUser = (User) userService.login(user);
		if(existUser==null){
			this.addActionError("��¼ʧ��,�û������������");
			return "loginfailed";      
		}else{
			//���û���Ϣ����session��
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return "loginsuccess";
		}
	}

	//ע��
	public String register(){
		if(userService.addUser(user)==true){
			return "registersuccess";
		}else{
			this.addActionError("ע��ʧ�ܣ��û����������ַ�Ѵ���");
			return "registerfailed";
		}
	}
	
/*	//����û�
	public String addUser(){
		userService.addUser(user);
		return SUCCESS;
	}*/
	
	//ɾ���û�
/*	public String deleteUser(){
		
		return SUCCESS;
	}*/
	
/*	//�޸��û�
	public String updateUser(){
		return SUCCESS;
	}*/
	
}
