package com.dependecy.injection.dependency_injection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DependencyInjectionApplicationTests {

    @Test
    public void contextLoads() {
        Assert.assertEquals(1,1);
    }

}
