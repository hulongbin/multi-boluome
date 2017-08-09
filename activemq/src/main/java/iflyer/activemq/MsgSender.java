package iflyer.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;

/**
 * 消息发送者
 *
 * @author Zebe
 * @version 1.0.0
 */
@Component
public class MsgSender {

	private static final String QUEUENAME = "my-destination";
	@Autowired
	private JmsTemplate jmsTemplate;//通过@Qualifier修饰符来注入对应的bean

	/**
	 * 发送一条消息到指定的队列（目标）
	 *
	 * @params s 序列化对象 和 receiver 中的getObject对应
	 */
	public void objectSendQueue(final Serializable s) {
		jmsTemplate.send(QUEUENAME, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(s);
			}
		});
	}


	public void textSendQueue(String message) {
		jmsTemplate.send(QUEUENAME, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

	public void objectSendTopic(String message) {
		jmsTemplate.send(QUEUENAME, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}


}

