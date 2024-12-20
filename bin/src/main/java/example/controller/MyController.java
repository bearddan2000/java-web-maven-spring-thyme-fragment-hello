package example.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController{
	
	final String title = "example";
	final List<String> names = Arrays.asList("Hi", "Bye");

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(Model model){

		model.addAttribute("title", title);
		model.addAttribute("list", names);

		return "index";
	}
}