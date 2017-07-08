package cn.edu.glut.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.service.UserprofileService;

@Transactional
public class UserprofileServiceImpl implements UserprofileService {
		private UserDao userdao;
		
		
		public UserDao getUserdao() {
			return userdao;
		}

		public void setUserdao(UserDao userdao) {
			this.userdao = userdao;
		}

		@Override
		public boolean updateuserprofile(Userprofile userprofile) {
			// TODO Auto-generated method stub
			return userdao.updateuserprofile(userprofile);
		}

		@Override
		public Userprofile finduserprofilebyname(String username) {
			// TODO Auto-generated method stub
			return userdao.finduserprofilebyname(username);
		}
	
}
