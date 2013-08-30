package com.springapp.mvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapp.dao.HelloDao;
import com.springapp.dto.HelloDto;

@Controller
@RequestMapping("/")
public class HelloController {

	@Resource
	private HelloDao helloDao;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(HttpServletRequest request, ModelMap model) {

		HelloDto helloDto = helloDao.getHello(1);

		model.addAttribute("message", helloDto.getMessage());
		return "hello";
	}
}
