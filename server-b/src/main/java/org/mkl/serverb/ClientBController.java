package org.mkl.serverb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mkl
 * @date 2021/5/20
 * @description
 */
@RequestMapping("/serverb")
@RestController
public class ClientBController {

	@Autowired
	ServiceAClient serviceAClient;

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam("name") String name) throws Exception {
		return serviceAClient.sayHello(name);
	}

	@GetMapping("/sayGoodBye")
	public String sayGoodBye(@RequestParam("name") String name){
		return serviceAClient.sayGoodBye(name);
	}
}
