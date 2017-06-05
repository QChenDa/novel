package cn.edu.glut.daoimpl.copy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.entity.Userrights;

public class UserDaoImpl implements UserDao{
	//ע��SessionFactory
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//ע��HibernateTemplate(Hibernate5�汾)
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//����û�
	@SuppressWarnings("unchecked")
	@Override
	public boolean addUser(User user) {
		//�û���Ϣ����
		Userprofile userprofile = new Userprofile();
		//userprofile.setUserId(user.getUserId());
		userprofile.setUserName(user.getUserName());
		userprofile.setUserEmali(user.getUserEmali());
		userprofile.setUserPw(user.getUserPw());;
		
		//�û�Ȩ�޼���
		Userrights userrights = new Userrights();
		//userrights.setUserId(user.getUserId());
		userrights.setUserType("����");
		userrights.setUserGrade(1);
		
		//��������
		Book book = new Book();
		book.setBookId(user.getUserId());
		
		
		//����ע�������Ϣ
		user.getUserprofiles().add(userprofile);
		//����ע���û�Ȩ��
		user.getUserrightses().add(userrights);
		//��������
		user.getBooks().add(book);
		
		Integer i = (Integer) hibernateTemplate.save(user);
		if (i != null) {
			return true;
		} else {
			return false;
		}
	}

	//�����û�����ѯ
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

	//���ݵ��������ѯ
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


	//�����û����������ѯ
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

	//ɾ���û�
	@Override
	public void delete(User user) {
		Session session = sessionFactory.openSession();
		session.delete(user);
	}

	//�޸��û�
	@Override
	public User update(User user) {
		Session session = sessionFactory.openSession();
		User us = session.get(User.class, user.getUserName());
		session.save(us);
		return null;
	}

	
	


}
