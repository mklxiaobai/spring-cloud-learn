package org.mkl.serverb;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author mkl
 * @date 2021/5/21
 * @description
 */
@FeignClient(name = "ServerA" , fallbackFactory = ServiceAClientFallbackFactory.class)
public interface ServiceAClient extends ServiceAInterface {
}
