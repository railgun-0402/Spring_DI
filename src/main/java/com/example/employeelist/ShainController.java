package com.example.employeelist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShainController {
	
	@RequestMapping("/input")
	public String index(ShainForm shainForm) {
		return "index.html";
	}
	
	@RequestMapping("/output")
	public String result(@Validated ShainForm shainForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index.html";
		}
		
		// サービス層から社員を検索する
		ShainService shainServece = new ShainServiceImpl();
		String name = shainServece.findByNo(shainForm.getNumber());
		model.addAttribute("number", shainForm.getNumber());
		model.addAttribute("name", name);
		return "output.html";
	}
}
