package cn.edu.glut.dao.copy;

import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userrights;

public interface AuthorDao {
	boolean addUser(User user);
	boolean findByName(String name);
	boolean findByEmail(String email);
	void delete(User user);
	User find(User user);
	User update(User user);
//	String fingUserType(Userrights userrights);
}
