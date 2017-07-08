package cn.edu.glut.action.copy;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.User;
import cn.edu.glut.service.copy.AuthorService;

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
			this.addActionError("��¼ʧ��,�û�����������");
			return "loginfailed";      
		}else{
			//���û���Ϣ����session��
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return "loginsuccess";
		}
	}
	
	//ע��
	public String register(){
		if(authorService.addUser(user)==true){
			return "registersuccess";
		}else{
			this.addActionError("ע��ʧ�ܣ��û���������ַ�Ѵ���");
			return "registerfailed";
		}
	}
	
}
