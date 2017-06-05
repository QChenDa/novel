package cn.edu.glut.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserprofileDao;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.service.UserprofileService;

@Transactional
public class UserprofileServiceImpl implements UserprofileService {
	private UserprofileDao userprofileDao;
	public void setUserprofileDao(UserprofileDao userprofileDao) {
		this.userprofileDao = userprofileDao;
	}
	
	//����û���Ϣ
	@Override
	public Serializable addUserprofile(Userprofile userprofile) {
		return userprofileDao.add(userprofile);
	}

	@Override
	public List<Userprofile> getAllUserprofile() {
		return userprofileDao.getAllUserprofile();
	}

	//��ҳ��ѯ
	@Override
	public List<Userprofile> getByPage(int index, Class clazz, String hql) {

		List<Object> list = userprofileDao.getByPage(index, clazz, hql);
		return this.obj2Empl(list);
	}

	//����һ������
	public List<Userprofile> obj2Empl(List<Object> list) {

		List<Userprofile> elist = new ArrayList<Userprofile>();
		for (Object obj : list) {

			Userprofile em = (Userprofile) obj;
			elist.add(em);
		}

		return elist;
	}

	//��ѯ����
	@Override
	public List<Userprofile> getAllEmployer(Class clazz, String hql) {
			return this.obj2Empl(userprofileDao.getAllEmployer(clazz, hql));
		}

	//ɾ���û�
	@Override
	public void deleteUserprofile(String name) {
		User user = userprofileDao.findByUsername(name);
		userprofileDao.deleteUserprofile(user);
	}

	

	
	
}
