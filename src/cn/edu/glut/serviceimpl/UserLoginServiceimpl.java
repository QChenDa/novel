package cn.edu.glut.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.daoimpl.UserDaoimpl;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserLoginService;


public class UserLoginServiceimpl implements UserLoginService{
		private UserDaoimpl userdao;



		public UserDaoimpl getUserdao() {
			return userdao;
		}



		public void setUserdao(UserDaoimpl userdao) {
			this.userdao = userdao;
		}



		public User Login(String username){
			return userdao.find(username);
		}



		@Override
		public boolean Verification(String username) {
			// TODO Auto-generated method stub
			
			return userdao.findByName(username);
		}

}
