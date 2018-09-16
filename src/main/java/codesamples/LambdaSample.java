package codesamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.superior.fw.superior.entity.Chapter;

import reactor.core.publisher.Flux;

public class LambdaSample {

//	public static void main(String[] args) {
//		LambdaSample lm = new LambdaSample();
//		// lm.doLamda();
//		lm.doFlux();
//		lm.doSupplier();
//	}

	/**
	 * 
	 * aaああああ
	 */
	public void doLamda() {
		List<String> list = Arrays.asList("aaa", "bbb", "cccc", "ddd");
		// 1st lamda sample expression
		list.forEach((String str) -> {
			System.out.println(str);
		});

		// 省略形
		System.out.println("----");
		list.forEach(s -> System.out.println(s));

		System.out.println("------");
		list.forEach(System.out::println);
	}

	public void doFlux() {
		System.out.println("start");
		Flux.just(new Chapter("quick"), new Chapter("start"), new Chapter("java")).subscribe(System.out::println);
		System.out.println("end");

	}

	public void doSupplier() {
		// tag::7[]
		Flux.just((Supplier<String>) () -> "alphaPPP", (Supplier<String>) () -> "bravo", (Supplier<String>) () -> "charlie")
				.subscribe(supplier -> System.out.println(supplier.get()));
		// end::7[]
	}

}
