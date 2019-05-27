package pcpkg;



public class ProducerConsumerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherDetails wd = new WeatherDetails();
		WeatherDetails wd1 = new WeatherDetails();
		WeatherDetails wd2 = new WeatherDetails();
		WeatherDetails wd3 = new WeatherDetails();
		WeatherDetails wd4 = new WeatherDetails();
		
		wd.setCity("Chennai");
		wd.setCountry("India");
		wd.setState("TN");
		wd.setTemp(10);
		
		wd1.setCity("Chennai");
		wd1.setCountry("India");
		wd1.setState("TN");
		wd1.setTemp(20);
		
		wd2.setCity("Chennai");
		wd2.setCountry("India");
		wd2.setState("TN");
		wd2.setTemp(30);
		
		wd3.setCity("Coimbatore");
		wd3.setCountry("India");
		wd3.setState("TN");
		wd3.setTemp(50);
		
		wd4.setCity("Coimbatore");
		wd4.setCountry("India");
		wd4.setState("TN");
		wd4.setTemp(50);
		
		

		
		CustomProducer cp = new CustomProducer(wd);
		cp.producer();
		
		CustomProducer cp1 = new CustomProducer(wd1);
		cp1.producer();
		
		CustomProducer cp2 = new CustomProducer(wd2);
		cp2.producer();
		
		CustomProducer cp3 = new CustomProducer(wd3);
		cp3.producer();
		
		CustomProducer cp4 = new CustomProducer(wd4);
		cp4.producer();
		
		
		
		CustomConsumer cc = new CustomConsumer();
		//cc.consumer();

	}
}
