package com.le.homepage.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/home.htm")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/signup.htm")
	public String launchSignup() {
		return "signup";
	}

	@RequestMapping("/viewMyCourses.htm")
	public String launchViewMyCourses() {
		return "listMyCourses";
	}
	
	@RequestMapping("/viewCourse.htm")
	public String launchViewCourse() {
		return "viewCourse";
	}
	
	@RequestMapping("/newCourse.htm")
	public String launchCreateNewCourse() {
		return "newCourse";
	}

}