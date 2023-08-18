package com.java.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class program {
	public static void prog(){
		String words = "apple and apple";

        int wordCount = countWords(words);

        System.out.println("number of words :" + wordCount);
    }

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+"); 
        return words.length;
    }
		
	public static void Duplicate_num() {
		System.out.println("=================================================");
		String word="apple and apple";
		String[] split = word.split(" ");
		Map <String,Integer> map=new LinkedHashMap<>();
		for (String words : split) {
			if(map.containsKey(words)) {
			Integer view = map.get(words);
			map.put(words, view+1);
		}
		else {
			map.put(words, 1);
			
		}
			}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate word :"+entry);
			}
		}
		
		
	}
	public static void postion() {
		System.out.println("=====================================================");
		String input = "appleandapple";
        Map<Character, Integer> charToPositionMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charToPositionMap.containsKey(c)) {
                System.out.println("Duplicate  " + c + "  positions " +
                        charToPositionMap.get(c) + " and " + i);
            } else {
                charToPositionMap.put(c, i);
            }
        }
	}

	public static void uppandlower() {
		System.out.println("=====================================");
		String input = "YuVa GaNeSh";
	        int upperCaseCount = 0;
	        int lowerCaseCount = 0;

	        for (char c : input.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                upperCaseCount++;
	            } else if (Character.isLowerCase(c)) {
	                lowerCaseCount++;
	            }
	        }

	        System.out.println("Uppercase : " + upperCaseCount);
	        System.out.println("Lowercase : " + lowerCaseCount);
	}

	public static void main(String[] args) {
		prog();
		Duplicate_num();
		postion() ;
		uppandlower();
	}

}
