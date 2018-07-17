package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.management.User;

import Services.GlobalService;

@RestController
public class GlobalController {

	
	@Autowired
	GlobalService gs;
	
	@RequestMapping("/insert_staff")
	public String  correct_staff() {
		
		return gs.correct_staff();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String login(@RequestBody User user) {
		
		//return "tes";
		return gs.login(user);		
		
	}
	
	
	
}
