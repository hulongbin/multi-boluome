package iflyer.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
@Configuration
public class ActivemqComponent {

	@Bean("myQueue")
	public ActiveMQQueue myQueue() {
		return new ActiveMQQueue("my.queue");
	}

	@Bean("myTopic")
	public ActiveMQTopic myTopic() {
		return new ActiveMQTopic("my.topic");
	}

	@Autowired
	private ActiveMQConnectionFactory connectionFactory;


	@Bean(name = "queueListenerFactory")
	public DefaultJmsListenerContainerFactory queueListenerFactory(){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setPubSubDomain(false);
		return factory;
	}

	@Bean(name = "topicListenerFactory")
	public DefaultJmsListenerContainerFactory topicListenerFactory(){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setPubSubDomain(true);
		return factory;
	}
}
