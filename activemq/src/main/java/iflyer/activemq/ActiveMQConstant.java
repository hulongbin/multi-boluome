package iflyer.activemq;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
public interface ActiveMQConstant {

	public enum MSG_TYPE { QUEUE,TOPIC}

	public enum ActiveMQEnum {

		MY_QUEUE("my.queue",MSG_TYPE.QUEUE,"queueListenerFactory"),
		MY_TOPIC("my.topic",MSG_TYPE.TOPIC,"topicListenerFactory");

		ActiveMQEnum(String destination, MSG_TYPE type, String connFactory) {
			this.destination = destination;
			this.type = type;
			this.connFactory = connFactory;
		}

		private String destination;
		private MSG_TYPE type;
		private String connFactory;


		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public MSG_TYPE getType() {
			return type;
		}

		public void setType(MSG_TYPE type) {
			this.type = type;
		}

		public String getConnFactory() {
			return connFactory;
		}

		public void setConnFactory(String connFactory) {
			this.connFactory = connFactory;
		}
	}

}
