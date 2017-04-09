package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Page2Controller {
	@RequestMapping(value="/conference", method=RequestMethod.GET)
	String showPage2(){
		return "jsp/conference";
	}

}
