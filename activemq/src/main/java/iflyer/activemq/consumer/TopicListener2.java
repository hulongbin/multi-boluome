package iflyer.activemq.consumer;

import iflyer.activemq.util.ActiveMQUtil;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
@Service("topicListener2")
public class TopicListener2 {

	@JmsListener(destination = "my.topic", containerFactory = "topicListenerFactory")
	public void reveiveTopic(Object message) {
		ActiveMQUtil.receiver(message);
	}
}