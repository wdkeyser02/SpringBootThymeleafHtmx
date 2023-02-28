package willydekeyser.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private final Random random = new Random();
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title", "Spring Boot Thymeleaf Htmx");
		model.addAttribute("text", "Welcome Spring Boot Thymeleaf Htmx!");
		return "index";
	}
	
	@GetMapping("/number1")
	public String number1(Model model) {
		Integer number1 = random.nextInt(99);
		model.addAttribute("number", number1);
		return "number::number";
	}
	
	@GetMapping("/number2")
	public String number2(Model model) {
		Integer number2 = random.nextInt(9999);
		model.addAttribute("number", number2);
		return "number::number";
	}
	
	@GetMapping("/button1")
	public String button1(Model model) {
		model.addAttribute("button1", "You pushed me!");
		return "number::button";
	}
}
