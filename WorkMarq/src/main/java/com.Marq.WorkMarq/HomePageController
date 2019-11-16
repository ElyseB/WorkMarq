package com.Marq.WorkMarq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	//WorkMarq - make your Marq at work!
	
	@GetMapping("/homePage")
	//public String greeting(Model model) {
		public String greeting(@RequestParam(name="name", required=false, defaultValue="Hello") String name, Model model) {
	        model.addAttribute("name", name);
		return "homePage";
	}

}
