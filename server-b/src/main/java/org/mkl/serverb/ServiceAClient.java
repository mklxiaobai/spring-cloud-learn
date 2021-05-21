package org.mkl.serverb;

import org.mkl.ServiceAInterface;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author mkl
 * @date 2021/5/21
 * @description
 */
@FeignClient(name = "ServerA")
public interface ServiceAClient extends ServiceAInterface {
}
