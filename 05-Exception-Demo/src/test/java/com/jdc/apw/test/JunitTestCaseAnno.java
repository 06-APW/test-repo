package com.jdc.apw.test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Before all and after all annotations only work on static method.
// @Order(Method) and @TestMethodOrder(class) is required to arrange the test order.

@TestMethodOrder(OrderAnnotation.class)
public class JunitTestCaseAnno {
	@BeforeAll
	static void beforeAll() {
		System.out.println("========= Before All ============");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("========== After All =============");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("	====== Before Each ==== 	");
	}
	@AfterEach
	void afterEach() {
		System.out.println("	====== After Each ====		");
	}
	@Test
	@Order(2)
	void test1() {
		System.out.println("      Test One      ");
	}
	@Test
	@Order(3)
	void test2() {
		System.out.println("      Test Two     ");
	}
	@Test
	@Order(1)
	void test3() {
		System.out.println("      Test Three    ");
	}
}
