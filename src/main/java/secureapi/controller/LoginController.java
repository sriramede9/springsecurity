package secureapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/showLoginPage")
	public String showcustomloginpage() {
		return "login-form";
	}

//	@PostMapping("/authenticateTheUser")
//	public String authnticateuser() {
//		return "home";
//	}
}
