package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloCon implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		
		//ServletRequest request = null;
		String name=arg0.getParameter("name");
		Map m=new HashMap();
		m.put("msg","Welcome " + name);
		ModelAndView mav=new ModelAndView("success",m);
		//return null;
		return mav;
	}

}
