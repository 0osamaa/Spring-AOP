package com.osama;

import com.osama.service.Business1;
import com.osama.service.Business2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class SpringAopApplicationTests {

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	@Test
	public void invokeAOPStuff() {
		log.info(business1.calculateSomething());
		log.info("Sum of numbers in 12rs5w6yw1 is {}",business1.sumOfdigits());
		log.info(business2.calculateSomething());

		int[] data  = new int[]{1,45,3,9,44,84};

		Integer result = Arrays.stream(data).min().orElse(0);
		System.out.println(result);

	}

}
