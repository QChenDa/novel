package cn.edu.glut.dao;

import java.io.Serializable;
import java.util.List;

import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;

public interface UserprofileDao {
	Serializable add(Userprofile userprofile);
	List<Userprofile> getAllUserprofile();
	//分页查询
	List<Object> getByPage(int index, Class<?> clazz, String hql);
	//查询所有
	List<Object> getAllEmployer(Class<?> clazz,String hql);
	//删除用户
	void deleteUserprofile(User user);
	//按用户名查询
	User findByUsername(String name);
}
