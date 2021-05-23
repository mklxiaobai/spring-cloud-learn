package org.mkl.serverb;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author mkl
 * @date 2021/5/23
 * @description
 */
@Component
public class ServiceAClientFallbackFactory implements FallbackFactory<ServiceAClient> {
	@Override
	public ServiceAClient create(Throwable throwable) {
		return new ServiceAClient() {
			@Override
			public String sayHello(String name) {
				return "{fallBack 'msg': 'hello, " + name + "'}";
			}

			@Override
			public String sayGoodBye(String name) {
				return "{'fallBack msg': 'goodBye, " + name + "'}";
			}
		};
	}
}
