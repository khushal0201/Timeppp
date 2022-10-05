package com.inc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class typ{
	
	
	      @RequestMapping(value="/helo",method=RequestMethod.GET)
	      @ResponseBody
	      public String sm() {
	    	  return "<h1>hello bc</h1>";
	      }
}