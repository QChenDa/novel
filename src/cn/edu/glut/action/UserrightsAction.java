package cn.edu.glut.action;

import cn.edu.glut.entity.Userrights;
import cn.edu.glut.serviceimpl.UserprofileServiceImpl;
import cn.edu.glut.serviceimpl.UserrightsServiceImpl;

public class UserrightsAction {
	
	
			private UserrightsServiceImpl userrightsServiceImpl;

			private Userrights	userrights;

			public UserrightsServiceImpl getUserrightsServiceImpl() {
				return userrightsServiceImpl;
			}



			public void setUserrightsServiceImpl(UserrightsServiceImpl userrightsServiceImpl) {
				this.userrightsServiceImpl = userrightsServiceImpl;
			}



			public String Updaterights(){
				if(userrightsServiceImpl.updateuserrights(userrights))				
					return "Updaterights";
				else
					return "error";
				
			}
}
