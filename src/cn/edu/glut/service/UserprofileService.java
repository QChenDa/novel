package cn.edu.glut.service;

import java.io.Serializable;
import java.util.List;
import cn.edu.glut.entity.Userprofile;

public interface UserprofileService {
	Serializable addUserprofile(Userprofile userprofile);
	List<Userprofile> getAllUserprofile();
	
	//��ҳ��ѯ
	List<Userprofile> getByPage(int index,Class clazz,String hql);
	//��ѯ����
	List<Userprofile> getAllEmployer(Class clazz,String hql);
	//ɾ���û�
	void deleteUserprofile(String name);
}
