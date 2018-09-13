package com.superior.fw.superior.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LamdaSampleService {
	
	public LamdaSampleService() {
		super();

		System.out.println("XXXXX");
		doLamda();
	}

	/**
	 * ラムダの実行を行うサンプル
	 */
	public void doLamda() {
		List<String> list = Arrays.asList("aaa","bbb","cccc");
		//1st lamda sample expression
		list.forEach(str->System.out.println(str));
		
		list.forEach(System.out::println);
	}
}
