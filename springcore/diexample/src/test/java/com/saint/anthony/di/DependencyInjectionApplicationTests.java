package com.saint.anthony.di;

import com.saint.anthony.di.services.HelloWorldFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldFactory.class)
public class DependencyInjectionApplicationTests {

    @Test
    public void contextLoads() {
    }

}
