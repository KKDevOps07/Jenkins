package com.narvee;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AtsServerApplicationTests {

	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis() {
		System.out.println("@BeforeEach executed");
	}

	@Tag("DEV")
	@Test
	void testCalcOne() {
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(4, 2 + 2);
	}

	@Tag("PROD")
	@Disabled
	@Test
	void testCalcTwo() {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(6, 2 + 4);
	}

	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear() {
		System.out.println("@AfterAll executed");
	}
}
