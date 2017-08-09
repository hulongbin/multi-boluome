package iflyer.web;

import iflyer.model.User;
import iflyer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuxin on 17/1/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "{name}/user", method = RequestMethod.GET)
	public String getUserInfo(@PathVariable(name = "name") String name, ModelMap modelMap) {
//        User user= userService.getUser(name);
//        User user = new User("xxxx", "tt");
//        modelMap.put("user",user);
//        return new ModelAndView("user",modelMap);
		return "index";
	}

	@RequestMapping(value = "/save/{name}/{age}", method = RequestMethod.GET)
	public ModelAndView saveUserInfo(@PathVariable(name = "name") String name, @PathVariable(name = "age") String age, ModelMap modelMap) {
		User user = userService.saveUser(name, age);
		modelMap.put("user", user);
		return new ModelAndView("user", modelMap);
	}

}

//@Controller
//public class HelloController {
//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }
//}