package org.mkl.serverb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mkl
 * @date 2021/5/21
 * @description
 */
@RequestMapping("/")
public interface ServiceAInterface {

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam("name") String name) throws Exception;

	@GetMapping("/sayGoodBye")
	public String sayGoodBye(@RequestParam("name") String name);
}
