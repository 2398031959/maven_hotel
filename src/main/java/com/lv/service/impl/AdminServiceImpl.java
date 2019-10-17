package com.lv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lv.dao.AdminMapper;
import com.lv.po.Admin;
import com.lv.po.AdminExample;
import com.lv.po.AdminExample.Criteria;
import com.lv.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin adminLogin(Admin admin) {
		AdminExample adminExample = new AdminExample();
		Criteria createCriteria = adminExample.createCriteria();
		createCriteria.andUsernameEqualTo(admin.getUsername());
		createCriteria.andPasswordEqualTo(admin.getPassword());
		List<Admin> selectByExample = adminMapper.selectByExample(adminExample);
		for (Admin admin2 : selectByExample) {
			return admin2;
		}
		return null;
	}

}
