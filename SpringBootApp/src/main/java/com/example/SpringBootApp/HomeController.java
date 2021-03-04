package com.example.SpringBootApp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
   @RequestMapping("home")
   public ModelAndView home(Information information)
   {
	   ModelAndView mv= new ModelAndView();
	   mv.addObject("obj",information);
	   mv.setViewName("home");
	   return mv;
}
}
