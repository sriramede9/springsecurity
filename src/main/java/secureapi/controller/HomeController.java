package secureapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showhomepage() {

		return "home";
	}

	//request mapping for /leaders

	@GetMapping("/leaders")
	public String showleaders() {

		return "leaders";
	}
}
