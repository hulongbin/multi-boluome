package iflyer.activemq;

import iflyer.activemq.util.ActiveMQUtil;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

/**
 * 消息接收者
 *
 * @author Zebe
 * @version 1.0.0
 */
@Component
public class MsgReceiver {

	@JmsListener(destination = "my-destination")
	public void receiveMessage(Object message) throws JMSException {
		ActiveMQUtil.receiver(message);
	}

}
