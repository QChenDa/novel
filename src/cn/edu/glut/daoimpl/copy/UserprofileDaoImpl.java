package cn.edu.glut.daoimpl.copy;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.edu.glut.dao.copy.UserprofileDao;
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
		//�û�����
		User user = new User();
		user.setUserEmali(userprofile.getUserEmali());
		user.setUserName(userprofile.getUserName());
		user.setUserPw(userprofile.getUserPw());
		
		//�û�Ȩ�޼���
		Userrights userrights = new Userrights();
		userrights.setUserGrade(1);
		userrights.setUserType("����");
		
		//userprofile.setUser(user);
		//���һ���ȱ���һ�����ٱ���෽
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
	
	//��ҳ��ѯ
	public List<Object> getByPage(int index, Class clazz, String hql) {
		return super.selectPage(index, clazz, hql);
	}

	
	//��ѯ����
	@Override
	public List<Object> getAllEmployer(Class clazz, String hql) {
		return super.getAllObject(clazz, hql);
	}

	@Override
	public void deleteUserprofile(User user) {
		hibernateTemplate.delete(user);
	}

	//����û����ѯ
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
