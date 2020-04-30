package com.arnab.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	public String home(HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("Hi " + name);
//		session.setAttribute("name", name);
//		return "home";
//	}
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name")String myName) {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		return mv;
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(Alien alien) {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("obj",alien);
//		mv.setViewName("home");
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
}
