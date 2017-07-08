package cn.edu.glut.service;

import cn.edu.glut.entity.Userrights;

public interface UserrightsService {
			
			public boolean updateuserrights(Userrights userrights);

			public Userrights finduserrightsbyid(int userid);
}
