package cn.edu.glut.daoimpl.copy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.edu.glut.dao.AuthorDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.entity.Userrights;

public class AuthorDaoImpl implements AuthorDao {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//添加用户
	@Override
	public boolean addUser(User user) {
		//用户信息级联
		Userprofile userprofile = new Userprofile();
		//userprofile.setUserId(user.getUserId());
		userprofile.setUserName(user.getUserName());
		userprofile.setUserEmali(user.getUserEmali());
		userprofile.setUserPw(user.getUserPw());;
		
		//用户权限级联
		Userrights userrights = new Userrights();
		//userrights.setUserId(user.getUserId());
		userrights.setUserType("作者");
		userrights.setUserGrade(1);
		
		//保存注册个人信息
		user.getUserprofiles().add(userprofile);
		//设置注册用户权限
		user.getUserrightses().add(userrights);
		
		Integer i = (Integer) hibernateTemplate.save(user);
		if (i != null) {
			return true;
		} else {
			return false;
		}
	}

	//根据用户名查询
	@Override
	public boolean findByName(String name) {
		String hql = "from User u where u.userName=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, name);
		if(list.size()>0 && list!=null){
			return true;
		}else{
			return false;
		}
	}

	//根据电子邮箱查询
	@Override
	public boolean findByEmail(String Email) {
		String hql = "from User u where u.userEmali=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, Email);
		if(list.size()>0 && list!=null){
			return true;
		}else{
			return false;
		}
	}


	//根据用户名和密码查询
	@Override
	public User find(User user) {
		String hql = "from User where userName=? and userPw=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, user.getUserName(),user.getUserPw());
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	//删除用户
	@Override
	public void delete(User user) {
		Session session = sessionFactory.openSession();
		session.delete(user);
	}

	//修改用户
	@Override
	public User update(User user) {
		Session session = sessionFactory.openSession();
		User us = session.get(User.class, user.getUserName());
		session.save(us);
		return null;
	}
	
/*	//查找用户类型
	@Override
	public String fingUserType(Userrights userrights) {
		String hql = "from Userrights where userType=?";
		List<Userrights> list = (List<Userrights>) hibernateTemplate.find(hql,userrights.getUserType());
		if(list!=null && list.size()>0){
			return list.get(0).getUserType();
		}else{
			return null;
		}
	}
*/
	
	
	
	
}
