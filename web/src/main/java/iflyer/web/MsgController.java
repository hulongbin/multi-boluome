package iflyer.web;

import iflyer.activemq.MsgSender;
import iflyer.activemq.producer.Producer;
import iflyer.core.AJaxJson;
import iflyer.model.User;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
@Controller
@RequestMapping("/message")
public class MsgController {

//	@Autowired
//	MsgSender msgSender;
	@Autowired
	private Producer producer;

	@Resource(name = "myTopic")
	private ActiveMQTopic myTopic;

	public MsgController(ActiveMQTopic myTopic) {
		this.myTopic = myTopic;
	}

	@RequestMapping(value = "send", method = RequestMethod.POST)
	@ResponseBody
	public AJaxJson send(HttpServletRequest request, @RequestBody(required = false) User data) {
		AJaxJson aJaxJson = new AJaxJson();
//		msgSender.objectSendQueue(data);
		aJaxJson.setSuccess(true);
		aJaxJson.setObj("success");
		producer.send(myTopic, data);
		return aJaxJson;
	}



}
