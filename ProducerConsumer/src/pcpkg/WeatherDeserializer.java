package pcpkg;


import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;




public class WeatherDeserializer implements Deserializer<WeatherDetails> {

	@Override
	public WeatherDetails deserialize(String arg0, byte[] devBytes) {
		ObjectMapper mapper = new ObjectMapper();
		WeatherDetails wdobj = null;
		try {
			wdobj = mapper.readValue(devBytes, WeatherDetails.class);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return wdobj;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void configure(Map<String, ?> arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

}
