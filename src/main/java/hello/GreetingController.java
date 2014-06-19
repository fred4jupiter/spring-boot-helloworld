package hello;

import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@Autowired
	private Environment environment;

	@Autowired
	private Properties appInfoProperties;

	@RequestMapping(value = "/")
	public String index() {
		return "redirect:greeting";
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		
		model.addAttribute("activeProfiles", StringUtils.arrayToCommaDelimitedString(environment.getActiveProfiles()));
		
		model.addAttribute("dateTime", new Date());
		
		model.addAttribute("projectVersion", appInfoProperties.getProperty("Project-Version"));
		model.addAttribute("buildDate", appInfoProperties.getProperty("Build-Date"));
		return "greeting";
	}

}
