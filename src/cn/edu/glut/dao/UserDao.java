package cn.edu.glut.dao;

import java.util.List;

import cn.edu.glut.entity.User;

public interface UserDao {
	boolean addUser(User user);
	boolean findByName(String name);
	boolean findByEmail(String email);
	void delete(String name);
	User find(User user);
}
