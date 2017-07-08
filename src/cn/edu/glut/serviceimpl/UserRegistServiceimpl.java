package cn.edu.glut.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.daoimpl.UserDaoimpl;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserRegistService;


public class UserRegistServiceimpl implements UserRegistService {
	UserDaoimpl userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDaoimpl userdao) {
		this.userdao = userdao;
	}

	@Override
	public boolean Regist(User user) {
		// TODO Auto-generated method stub
			
		boolean success = userdao.findByName(user.getUserName());
		if (success) {
			System.out.println(user.getUserId());
			userdao.addUser(user);
			return true;
		} else
			return false;

	}

}
