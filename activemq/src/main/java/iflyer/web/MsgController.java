//package iflyer.web;
//
//import iflyer.activemq.MsgSender;
//import iflyer.model.User;
//import iflyer.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * [Todo...]
// * Created by 胡龙宾<Vivian> on 2017/8/7.
// */
//@Controller
//@RequestMapping("/message")
//public class MsgController {
//
//	@Autowired
//	JmsTemplate jmsTemplate;
//
//	@RequestMapping(value = "/send", method = RequestMethod.GET)
//	public String getUserInfo(User user, ModelMap modelMap) {
//
//		jmsTemplate.send("my-destination", new MsgSender());
//		return "index";
//	}
//
//
//
//}
