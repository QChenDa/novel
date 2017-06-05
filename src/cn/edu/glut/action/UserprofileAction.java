package cn.edu.glut.action;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.service.UserprofileService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserprofileAction extends ActionSupport implements ModelDriven<Userprofile>{
	private UserprofileService userprofileService;
	public void setUserprofileService(UserprofileService userprofileService) {
		this.userprofileService = userprofileService;
	}
	
	private Userprofile userprofile = new Userprofile();
	@Override
	public Userprofile getModel() {
		return userprofile;
	}
	
	private List<Userprofile> list;
	private int index;
	
	
/*	//表达式封装
	private Userprofile userprofile;
	public Userprofile getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(Userprofile userprofile) {
		this.userprofile = userprofile;
	}
	*/
	//添加用户信息
	public String addUserprofile() throws UnsupportedEncodingException{
		//乱码问题
		//userprofile.setUserName(new String(userprofile.getUserName().getBytes("ISO8859-1"),"UTF-8"));
		//userprofile.setUserAddress(new String(userprofile.getUserAddress().getBytes("ISO8859-1"),"UTF-8"));
		System.out.println(userprofile);
		userprofileService.addUserprofile(userprofile);
		return "operatersuccess";
	}

	
	//删除用户信息
	public String deleteUserprofile(){
		userprofileService.deleteUserprofile(userprofile.getUserName());
		return "deletesuccess";
	}
	
	
	
	//查询用户信息
	public String getAllUserprofile(){
		list = userprofileService.getAllUserprofile();
		ServletActionContext.getRequest().getSession().setAttribute("list", list);
		return SUCCESS;
	}
	
/*	//查询用户信息
	public String getAllUserprofile(){
		
		
		String hql="";
		if(userprofile!=null){
			String username=null;
			String adress=null;
			try {
				
				username = new String((userprofile.getUserName().getBytes("ISO8859-1")),"UTF-8");
				adress= new String((userprofile.getUserAddress().getBytes("ISO8859-1")),"UTF-8");
				//username = userprofile.getUserName();
				//adress = userprofile.getUserAddress();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			//按条件查询
		if(username!=null&&!("".equals(username)))
			hql+=" and s.username like '%"+username+"%'";
		if(adress!=null&&!("".equals(adress)))
			hql+=" and s.adress like '%"+adress+"%'";
		if(userprofile.getUserPhone()!=null&&!("".equals(userprofile.getUserPhone())))
			hql+=" and s.telephone = "+userprofile.getUserPhone();
	}
		List<Userprofile> list = index != 0 ? userprofileService.getByPage(index, Userprofile.class,hql)
				:userprofileService.getByPage(1, Userprofile.class,hql);
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("list", list);
		session.setAttribute("thisindex",index==0?1:index);
		session.setAttribute("count",userprofileService.getAllEmployer(Userprofile.class,hql).size());
		System.out.println("0000"+list.size());
		
		return SUCCESS;
	}	
	
	*/
	
	
}
