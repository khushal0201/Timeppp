package com.inc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class typ{
	
	
	      @RequestMapping(value="/helo",method=RequestMethod.GET)
	      @ResponseBody
	      public String sm() {
	    	  return "<h1>hello bc</h1>"
	    	  		+ "<form action='sing'>"
	    	  		+ "enter name:<input type='text' name='yn' placeholder='yo mama'/>"
	    	  		+ "<input type='submit'/>"
	    	  		+ "</form>";
	      }
	      @RequestMapping(value="/sing",method=RequestMethod.GET)
	      @ResponseBody
	      public String ccm(@RequestParam("yn") String name) {
	    	             return "<h1>Bruh yo name is "+name+"</h1>";
	      }
}