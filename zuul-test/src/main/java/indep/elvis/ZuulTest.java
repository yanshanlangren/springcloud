package indep.elvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulTest {
    public static void main(String[] args) {
        SpringApplication.run(ZuulTest.class);
    }

//    @Bean
//    public TestFilter preRequestLogFilter() {
//        return new TestFilter();
//    }
}
