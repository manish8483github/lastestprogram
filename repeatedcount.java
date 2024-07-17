package com.velocity.practise;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class repeatedcount {

	public static void main(String[] args) {

		String s = "there is a tree tree has leaves leaves are green";
		Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
	}
}