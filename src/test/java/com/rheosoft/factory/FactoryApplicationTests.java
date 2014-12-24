package com.rheosoft.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FactoryApplication.class)
public class FactoryApplicationTests {
    
    @Autowired
    MyClient client;

	@Test
	public void doServiceTest() {
            client.someBusinessMethod();
            client.anotherBusinessMethod();
	}

}
