package cn.edu.glut.dao;

import java.io.Serializable;
import java.util.List;

import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;

public interface UserprofileDao {
	Serializable add(Userprofile userprofile);
	List<Userprofile> getAllUserprofile();
	//��ҳ��ѯ
	List<Object> getByPage(int index, Class<?> clazz, String hql);
	//��ѯ����
	List<Object> getAllEmployer(Class<?> clazz,String hql);
	//ɾ���û�
	void deleteUserprofile(User user);
	//���û�����ѯ
	User findByUsername(String name);
}
