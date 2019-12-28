package com.example.ek.junit5study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * junit5study
 * com.example.ek.junit5study.DisplayTest.java
 *
 * テストケース表示の例
 *
 * @author E-Kanegae
 *
 */
@DisplayName("テストケース表示確認用テスト")
class DisplayTest {

	@Test
	@DisplayName("失敗テスト")
	void testNG() {
		fail("まだ実装されていません");
	}

	@Test
	@DisplayName("成功テスト①")
	void testOK() {
	}

}
