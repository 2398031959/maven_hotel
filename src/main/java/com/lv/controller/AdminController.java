package com.lv.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lv.po.Admin;
import com.lv.service.AdminService;
import com.lv.util.Message;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin(){
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Message login(@RequestBody Admin admin,HttpSession session){
		Admin adminLogin = adminService.adminLogin(admin);
		Message message=Message.success().add("adminLogin", adminLogin);
		session.setAttribute("adminLogin", adminLogin);
		return message;
	}
	@RequestMapping("/management")
	public String management(HttpSession session){
		return "management";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:login";
	}
}
