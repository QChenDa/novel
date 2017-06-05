package cn.edu.glut.daoimpl.copy;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.edu.glut.dao.UserprofileDao;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.entity.Userrights;

public class UserprofileDaoImpl extends SuperDao implements UserprofileDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public Serializable add(Userprofile userprofile) {
		//用户级联
		User user = new User();
		user.setUserEmali(userprofile.getUserEmali());
		user.setUserName(userprofile.getUserName());
		user.setUserPw(userprofile.getUserPw());
		
		//用户权限级联
		Userrights userrights = new Userrights();
		userrights.setUserGrade(1);
		userrights.setUserType("读者");
		
		//userprofile.setUser(user);
		//多对一，先保存一方，再保存多方
		hibernateTemplate.save(user);
		hibernateTemplate.save(userrights);
		return hibernateTemplate.save(userprofile);
	}

	@Override
	public List<Userprofile> getAllUserprofile() {
		String hql = "from Userprofile";
		List<Userprofile> userprofiles = (List<Userprofile>) hibernateTemplate.find(hql);
		
		return userprofiles;
	}
	
	//分页查询
	public List<Object> getByPage(int index, Class clazz, String hql) {
		return super.selectPage(index, clazz, hql);
	}

	
	//查询所有
	@Override
	public List<Object> getAllEmployer(Class clazz, String hql) {
		return super.getAllObject(clazz, hql);
	}

	@Override
	public void deleteUserprofile(User user) {
		hibernateTemplate.delete(user);
	}

	//根据用户名查询
	@Override
	public User findByUsername(String name) {
		String hql = "from User where userName=?";
		List<User> list = (List<User>) hibernateTemplate.find(hql, name);
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	
	
	
}
