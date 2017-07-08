package cn.edu.glut.service;

import java.io.Serializable;
import java.util.List;

import cn.edu.glut.entity.Userprofile;

public interface UserprofileService {
			
			public boolean updateuserprofile(Userprofile userprofile);
			
			public Userprofile finduserprofilebyname(String username);
}
