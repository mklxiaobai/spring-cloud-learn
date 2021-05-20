package org.mkl.serverb;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mkl
 * @date 2021/5/20
 * @description
 */
@Configuration
@RestController
public class ClientBController {

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/")
	public String sayHello(@RequestParam("name") String name) {
		RestTemplate template = getRestTemplate();

		String result = template.getForObject("http://ServerA/sayHello?name="+name, String.class);
		System.out.println("sayHello，name = " + result);
		return "{'msg': 'hello, " + result + "'}";
	}
}
