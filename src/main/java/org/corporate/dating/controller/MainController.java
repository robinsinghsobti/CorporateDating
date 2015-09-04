package org.corporate.dating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("/hello")
	public ModelAndView showView(){		
		return new ModelAndView("hello");
	}
	
}
