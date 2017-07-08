package cn.edu.glut.service;

import cn.edu.glut.entity.User;

public interface UserLoginService {
			public User Login(String username);
			public boolean Verification(String username);
}
