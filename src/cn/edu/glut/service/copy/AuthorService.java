package cn.edu.glut.service.copy;

import cn.edu.glut.entity.User;

public interface AuthorService {

	//��¼
	User login(User user);
	
	//ע��
	Boolean addUser(User user);
}
