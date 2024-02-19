package com.example.employeelist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShainController {
	@RequestMapping("/input")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/output")
	public String result(@RequestParam("number") String number, Model model) {
		String name = "コントローラー太郎";
		model.addAttribute("number", number);
		model.addAttribute("name", name);
		return "output.html";
	}
}
