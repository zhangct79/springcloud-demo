package com.example.serviceA;

import com.example.serviceB.common.PersonModel;
import com.example.serviceBapi.IServiceBApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceAApplicationTests {

	@Autowired
	IServiceBApi iServiceBApi;

	@Test
	void contextLoads() {
		System.out.println(iServiceBApi.hello());

		PersonModel p1 = iServiceBApi.person();
		System.out.println(p1);
	}

}
