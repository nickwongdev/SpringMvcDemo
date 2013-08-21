package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(
			HttpServletRequest request,
			ModelMap model
	) {
		String userAgent = request.getHeader("User-Agent");
		model.addAttribute("message", userAgent);
		return "hello";
	}
}