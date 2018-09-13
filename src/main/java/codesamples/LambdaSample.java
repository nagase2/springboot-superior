package codesamples;

import java.util.Arrays;
import java.util.List;

public class LambdaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaSample lm = new LambdaSample();
		lm.doLamda();
	}

	/**
	 * ラムダの実行を行うサンプル。サンプルあああ
	 */
	public void doLamda() {
		List<String> list = Arrays.asList("aaa","bbb","cccc","ddd");
		//1st lamda sample expression
		list.forEach((String str)->{
			System.out.println(str);
		});
		
		//省略形
		System.out.println("----");
		list.forEach(s->System.out.println(s));
		
		System.out.println("------");
		list.forEach(System.out::println);
	}

}
