package iflyer.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
@Service("producer")
public class Producer {
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	public void send(Destination destination, final Object message) {
		jmsMessagingTemplate.convertAndSend(destination, message);
	}
}
