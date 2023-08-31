package indep.elvis.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-service", url = "http://localhost:8080/microservice-test/test/")
public interface TestFeignClient {
    @GetMapping(value = "/foo")
    public String test();
}
