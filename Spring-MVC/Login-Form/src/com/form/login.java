package com.form;

import javax.validation.Valid;

//import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class login {
	
//	@InitBinder
//	public void initBilder(WebDataBinder dataBinder) {
//		
//		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//		
//		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//		
//	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("user", new User());
		
		return "login";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("user") User theUser) {
		
		System.out.println("Username : " + theUser.getUsername());
		System.out.println("Password : " + theUser.getPassword());
		
		return "welcome";
	}
	
}





