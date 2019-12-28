package com.example.ek.junit5study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.ek.junit5study.resolver.RandomParameter;
import com.example.ek.junit5study.resolver.RandomParameter.RandomParam;

/**
 * junit5study
 * com.example.ek.junit5study.CustomExtensionTest.java
 *
 * 拡張したParameterResolver用のExtension確認用テスト
 *
 * @author E-Kanegae
 *
 */
@ExtendWith(RandomParameter.class)
class CustomExtensionTest {

	@Test
	void test(@RandomParam int i) {
		assertEquals(i , 1);
	}

}
