package vk.com.kafka.springbootkafkaproducerexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vk.com.kafka.springbootkafkaproducerexample.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {

	@Autowired
	private KafkaTemplate<String, User> kapKafkaTemplateForUser;
	
	
	private static final String TOPIC = "Kafka_Example";
	

	@GetMapping("/publish/{name}")
	public String postName(@PathVariable("name") final String name) {
		
		kapKafkaTemplateForUser.send(TOPIC , new User(name, "Development", 12000l));
		return "Published Sussessfully";
	}
}
