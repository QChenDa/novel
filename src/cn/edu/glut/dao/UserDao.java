package cn.edu.glut.dao;

import java.util.List;

import cn.edu.glut.entity.User;

public interface UserDao {
	boolean addUser(User user);
	boolean findByName(String name);
	boolean findByEmail(String email);
	void delete(User user);
	User find(User user);
	User update(User user);
}
