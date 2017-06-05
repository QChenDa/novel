package cn.edu.glut.service;

import java.io.Serializable;
import java.util.List;
import cn.edu.glut.entity.Userprofile;

public interface UserprofileService {
	Serializable addUserprofile(Userprofile userprofile);
	List<Userprofile> getAllUserprofile();
	
	//分页查询
	List<Userprofile> getByPage(int index,Class clazz,String hql);
	//查询所有
	List<Userprofile> getAllEmployer(Class clazz,String hql);
	//删除用户
	void deleteUserprofile(String name);
}
