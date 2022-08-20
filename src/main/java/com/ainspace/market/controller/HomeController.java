package com.ainspace.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ainspace.market.utils.Logger;

@Controller
@RequestMapping("/")
public class HomeController {
	
	static private String TAG = "HomeController";
	
	@RequestMapping("login.do")
	public String showLoginPage() throws Exception {
		Logger.debug(TAG, "showLoginPage() called");
		return "forward:/login.html";
	}
	
	@RequestMapping("index.do")
	public String showMainPage() throws Exception {
		Logger.debug(TAG, "showMainPage() called");
		return "forward:/products.html";
	}
	
	@RequestMapping("admin.do")
	public String showAdminPage() throws Exception {
		Logger.debug(TAG, "showAdminPage() called");
		return "forward:/admin.html";
	}
	
	@RequestMapping("history.do")
	public String showHistoryPage() throws Exception {
		Logger.debug(TAG, "showHistoryPage() called");
		return "forward:/history.html";
	}
	
}
