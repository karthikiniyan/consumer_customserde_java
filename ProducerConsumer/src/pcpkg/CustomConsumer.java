package pcpkg;


import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.streams.StreamsConfig;

public class CustomConsumer {
	@SuppressWarnings("deprecation")
	public void consumer() {
		String inputtopic="customproducertopic";
		String dir = "C:/kafka_2.11-2.2.0/kafka_2.11-2.2.0/logs/kafka_logs_2/";
		Properties props = new Properties();
		props.put(StreamsConfig.STATE_DIR_CONFIG, dir);
		props.put( StreamsConfig.APPLICATION_ID_CONFIG, "ConsumerPgm");
		props.put("bootstrap.servers", "localhost:9092");
		props.put("group.id", "test");
		props.put("enable.auto.commit", "true");
		props.put("auto.commit.interval.ms", "1000");
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "pcpkg.WeatherDeserializer");
		KafkaConsumer<String, WeatherDetails> consumer = new KafkaConsumer<>(props);
		consumer.subscribe(Arrays.asList(inputtopic)); 
		while (true) {
			
			ConsumerRecords<String, WeatherDetails> records = consumer.poll(1000);
			
			for (ConsumerRecord<String, WeatherDetails> record : records) {
				System.out.println("offset::" + record.offset() +"::country::"+ record.value().getCountry() + "::state::"+
					record.value().getState() + "::city::" +
						record.value().getCity() + "::temp::"+
						record.value().getTemp());
			}
	}

	}

}

