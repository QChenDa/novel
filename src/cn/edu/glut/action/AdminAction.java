package cn.edu.glut.action;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.glut.entity.Admin;
import cn.edu.glut.service.AdminService;

public class AdminAction extends ActionSupport {

	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String login() {

		Admin adm = adminService.login(admin);

		if (adm != null) {
			ServletActionContext.getRequest().getSession().setAttribute("admin_info", adm);
			return "loginsuccess";
		}

		return INPUT;
	}

	// ��ӹ���Ա
	public String addAdmin() {

		adminService.addAdmin(admin);

		return SUCCESS;
	}

	// �޸Ĺ���Ա
	public String updateAdmin() {

		adminService.updateAdmin(admin);

		return SUCCESS;
	}
}
