package cn.edu.glut.serviceimpl;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.entity.Userrights;
import cn.edu.glut.service.UserrightsService;

public class UserrightsServiceImpl implements UserrightsService {
				private UserDao userdao;

				public UserDao getUserdao() {
					return userdao;
				}

				public void setUserdao(UserDao userdao) {
					this.userdao = userdao;
				}

				@Override
				public boolean updateuserrights(Userrights userrights) {
					// TODO Auto-generated method stub
					return userdao.updateuserrights(userrights);
				}

				@Override
				public Userrights finduserrightsbyid(int userid) {
					// TODO Auto-generated method stub
					return userdao.finduserrightsbyid(userid);
				}
				
}
