package com.smart.smartcontactmanagerproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.smartcontactmanagerproject.Dao.UserRepository;
import com.smart.smartcontactmanagerproject.Entity.Contact;
import com.smart.smartcontactmanagerproject.Entity.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setName("Vishangi");
		user.setEmail("Vis@Gmail.com");
		
		Contact contact = new Contact();
		user.getContacts().add(contact);
		userRepository.save(user);
		return "Working !";
	}
}
