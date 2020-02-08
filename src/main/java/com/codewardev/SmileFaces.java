package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java

import java.util.List;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {
		List<String> valid = Arrays.asList(":)", ":D", ";-D", ":~)");
		
		arr.removeIf(x->(!valid.contains(x)));
		
		System.out.println("Size: "+arr.size());
		
		return arr.size();
	}

}
