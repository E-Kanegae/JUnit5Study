package com.example.ek.junit5study;

/**
 * junit5study
 * com.example.ek.junit5study.Calculate.java
 *
 * TODO ここにクラスの説明を書いてください。
 *
 * @author E-Kanegae
 *
 */
public class Calculator {

	public int add(int[] params) {
		if(params.length == 0) {
			return 0;
		}
		int added = 0;
		for(int param : params) {
			added = param + added;
		}
		return added;
	}

}
