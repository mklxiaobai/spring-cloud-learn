package org.mkl.servera;

import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: makailiang
 * @create: 2021-04-20
 **/
@RestController
public class ClientAController {

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam("name") String name) {
		System.out.println("sayHello，name = " + name);
		return "{'msg': 'hello, " + name + "'}";
	}

}
