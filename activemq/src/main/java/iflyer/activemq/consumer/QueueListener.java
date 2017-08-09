package iflyer.activemq.consumer;

import iflyer.activemq.util.ActiveMQUtil;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
@Service("queueListener")
public class QueueListener {

	@JmsListener(destination = "my.queue", containerFactory = "queueListenerFactory")
	public void receive(Object message) {
		ActiveMQUtil.receiver(message);

	}
}
