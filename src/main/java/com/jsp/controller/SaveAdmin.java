package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class SaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("AKASH");
		admin.setEmail_id("akash4498@gmail.com");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
