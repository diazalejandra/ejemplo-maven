package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import com.devopsusach2020.model.Mundial;
import com.devopsusach2020.rest.RestData;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads(){
		RestData rest = new RestData();
		Assertions.assertNotNull(rest.getData("Chile")); 
	}

	@Test
	void totalPais(){
		RestData rest = new RestData();
		Assertions.assertNotNull(rest.getTotalPais("Chile")); 
	}

}
