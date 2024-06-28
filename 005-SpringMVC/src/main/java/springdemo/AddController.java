package springdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j,HttpServletRequest request, 
			HttpServletResponse response) {
		
		//int i = Integer.parseInt(request.getParameter("t1"));   //RequestParam Instead
		//int j = Integer.parseInt(request.getParameter("t2"));
		
		int k = i+j;
		
		ModelAndView mv = new ModelAndView();              //ModelAndView
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
		
		
		
		
	}

}
