package com.example.ek.junit5study.truth;

import static com.google.common.truth.Truth.*;

import org.junit.jupiter.api.Test;

import com.example.ek.junit5study.Calculator;

/**
 * junit5study
 * com.example.ek.junit5study.JUnitJupiterTests.java
 *
 * 一番基本的なテストケースの例
 *
 * @author E-Kanegae
 *
 */
class JUnitJupiterByTruthTest {

	private final Calculator calculator = new Calculator();

	@Test
	void test() {
		int[] params = {1,1};
		int added = calculator.add(params);
		assertThat(added).isEqualTo(1);
	}

	@Test
	void testWithOriginalMsg() {
		int[] params = {1,1};
		int added = calculator.add(params);
		assertWithMessage(createFailedMsg(added, 1)).that(added).isEqualTo(1);
	}

	private String createFailedMsg(Object actual, Object expected) {
		StringBuffer sb = new StringBuffer();
		sb.append("テスト結果：").append(actual.toString()).append(System.lineSeparator());
		sb.append("       期待値      ：").append(expected.toString());
		return sb.toString();
	}

	@Test
	void testObjectIsNull() {
		String actual = null;
		assertThat(actual).isNull();

	}



}
