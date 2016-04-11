package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.dao.UserMapper;
import demo.model.User;

@Controller
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/dologin")
	public ModelAndView doLogin(String username, String password) {
		User user = this.userMapper.check(username, password);
		if (user == null) {
			
			return new ModelAndView("error");
		} else {
			ModelAndView modelAndView = new ModelAndView("success");
			modelAndView.addObject("username", username);
			return modelAndView;
		}
	}
}
