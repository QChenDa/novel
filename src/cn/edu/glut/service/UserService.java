package cn.edu.glut.service;

import cn.edu.glut.entity.User;

public interface UserService {
	
	//µÇÂ¼
	User login(User user);
	
	//×¢²á
	Boolean addUser(User user);
	
}
