package com.example.ek.junit5study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * junit5study
 * com.example.ek.junit5study.JUnitJupiterTests.java
 *
 * 一番基本的なテストケースの例
 *
 * @author E-Kanegae
 *
 */
class JUnitJupiterTests {

	private final Calculator calculator = new Calculator();

	@Test
	void test() {
		int[] params = {1,1};
		int added = calculator.add(params);
		assertEquals(2,added);
	}

	@Test
	void testGroup() {
		int[] params1 = {1};
		int[] params2 = {1,2};
		int[] params3 = {1,2,3};

		// 最後のアサーションは失敗
		assertAll("足し算テスト",
	            () -> assertEquals(1, calculator.add(params1)),
	            () -> assertEquals(3, calculator.add(params2)),
	            () -> assertEquals(3, calculator.add(params3))
	        );

	}

}
