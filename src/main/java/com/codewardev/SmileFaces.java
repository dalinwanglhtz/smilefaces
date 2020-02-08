package com.codewardev;

// https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java

import java.util.List;
import java.util.regex.Pattern;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {
		Pattern p = Pattern.compile("^[:;]{1}[-~]?[)D]{1}$");
		
		arr.removeIf(x->(!p.matcher(x).matches()));
		
		return arr.size();
	}

}
