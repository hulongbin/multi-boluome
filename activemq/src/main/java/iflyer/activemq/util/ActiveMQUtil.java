package iflyer.activemq.util;

import iflyer.model.User;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
public class ActiveMQUtil {


	public static void receiver(Object message) {
		if (message instanceof ObjectMessage) {
			ObjectMessage objectMessage = (ObjectMessage) message;
			User user = null;
			try {
				user = (User)objectMessage.getObject();
			} catch (JMSException e) {
				e.printStackTrace();
			}
			System.out.println("接收到消息：" + user.toString());
		} else {
			System.out.println("接收到消息：" + message);

		}
	}

}
