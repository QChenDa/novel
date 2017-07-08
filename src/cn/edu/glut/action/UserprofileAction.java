package cn.edu.glut.action;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.service.UserprofileService;
import cn.edu.glut.serviceimpl.UserprofileServiceImpl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserprofileAction extends ActionSupport {
	
		private UserprofileServiceImpl userprofileServiceImpl;
		
		private Userprofile userprofile;
		
		private String usrername;
		
		public String getUsrername() {
			return usrername;
		}
		public void setUsrername(String usrername) {
			this.usrername = usrername;
		}
		public UserprofileServiceImpl getUserprofileServiceImpl() {
			return userprofileServiceImpl;
		}
		public void setUserprofileServiceImpl(
				UserprofileServiceImpl userprofileServiceImpl) {
			this.userprofileServiceImpl = userprofileServiceImpl;
		}
		public Userprofile getUserprofile() {
			return userprofile;
		}
		public void setUserprofile(Userprofile userprofile) {
			this.userprofile = userprofile;
		}
		
		public String Updateprofile(){
			
			if(userprofileServiceImpl.updateuserprofile(userprofile))			
			return "Updateprofile";
			else
				return "error";
		}
		public String Showprofile(){
			userprofile=userprofileServiceImpl.finduserprofilebyname(usrername);
			if(userprofile.getUserId()!=0)
			return "Showprofile";
			else
				return "error";
		}
}
