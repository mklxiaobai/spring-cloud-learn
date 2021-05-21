package org.mkl.servera;

import org.mkl.ServiceAInterface;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: makailiang
 * @create: 2021-04-20
 **/
@RestController
public class ClientAController implements ServiceAInterface {


	@Override
	public String sayHello(String name) {
		System.out.println("sayHello，name = " + name);
		return "{'msg': 'hello, " + name + "'}";
	}

	@Override
	public String sayGoodBye(String name) {
		System.out.println("sayGoodBye，name = " + name);
		return "{'msg': 'goodBye, " + name + "'}";
	}
}
