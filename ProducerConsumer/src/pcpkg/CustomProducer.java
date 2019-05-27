package pcpkg;


import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.streams.StreamsConfig;

public class CustomProducer {
	private WeatherDetails weatherRecord;
	
	
	public CustomProducer( WeatherDetails weatherRecord) {
		this.weatherRecord = weatherRecord;
	
	}
	public void producer() {
		String inputTopic="customproducertopic";
		String dir = "C:/kafka_2.11-2.2.0/kafka_2.11-2.2.0/logs/kafka_logs_2/";
		Properties props = new Properties();
		props.put(StreamsConfig.STATE_DIR_CONFIG, dir);
		props.put( StreamsConfig.APPLICATION_ID_CONFIG, "ProducerPgm");
		props.put("bootstrap.servers", "localhost:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "pcpkg.WeatherSerializer");

		KafkaProducer<String, WeatherDetails> producer = new KafkaProducer<>(props);
		
		producer.send(new ProducerRecord<String, WeatherDetails>(inputTopic, this.weatherRecord));
		
		System.out.println("Message sent to customproducertopic");
		
		producer.close();
	}
}
