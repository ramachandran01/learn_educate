package com.le.homepage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.le.homepage.data.Module;

@Controller
public class ModuleController {

	/**
	 * Controller method to launch Create Module screen
	 * 
	 * @return
	 */
	@RequestMapping("/displayCreateModule.htm")
	public ModelAndView displayCreateModule() {
		return new ModelAndView("diplayCreateModule", "command", new Module());
	}

}
