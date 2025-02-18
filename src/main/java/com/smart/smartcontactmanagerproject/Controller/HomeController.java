package com.smart.smartcontactmanagerproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.smartcontactmanagerproject.Dao.UserRepository;
import com.smart.smartcontactmanagerproject.Entity.Contact;
import com.smart.smartcontactmanagerproject.Entity.User;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home page - Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About page - Smart Contact Manager");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Signup page - Smart Contact Manager");
		return "signup";
	}
	
}
