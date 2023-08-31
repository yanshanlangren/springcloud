package indep.elvis;

import indep.elvis.feignclient.TestFeignClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class FeignTest {

    @Autowired
    private TestFeignClient client;

    @Test
    public void test() {
        System.out.println(client.test());
    }
}