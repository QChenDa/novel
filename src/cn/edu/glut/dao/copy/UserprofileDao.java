package cn.edu.glut.dao.copy;

import java.io.Serializable;
import java.util.List;

import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;

public interface UserprofileDao {
	Serializable add(Userprofile userprofile);
	List<Userprofile> getAllUserprofile();
	
	List<Object> getByPage(int index, Class<?> clazz, String hql);
	
	List<Object> getAllEmployer(Class<?> clazz,String hql);
	
	void deleteUserprofile(User user);
	
	User findByUsername(String name);
}
