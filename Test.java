package com.chi;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {
	public static void main(String [] str) {
		System.out.println("Hello World");
		
		String patternString = "^(?=.*?(phone|fone|call|contact))(?=.*?(help|assistance|support)).*$";
		String stringToBeMatched = "What is the phone number to helpdesk? Can I call to support department from my cell phone? How can I contact helpdesk?";
		System.out.println("Match is:"+ test(stringToBeMatched, patternString));
		
		
		patternString = "^(?=.*?(John))(?=.*?(Payment)).*$";
		stringToBeMatched = "afdJohn Payment";
		printReport(stringToBeMatched, patternString);
		
		stringToBeMatched = " Payment John";
		printReport(stringToBeMatched, patternString);	
		
		stringToBeMatched = " Payment Mary";
		printReport(stringToBeMatched, patternString);	
		
		patternString = "\\b(?:(?:(one)|(two)|(three))(?:,|\\b)){3,}";
		stringToBeMatched = "one,two,three";
		printReport(stringToBeMatched, patternString);
		
		patternString = "\\b(?:(?:(one)|(two)|(three))(?:,|\\b)){3,}";
		stringToBeMatched = "one,three,two";
		printReport(stringToBeMatched, patternString);
		
		patternString = "\\b(?:(?:(?i)ONe|two|thRee)(?:,|\\b)){3,}";
		stringToBeMatched = "one,three,two,two,one,four";
		printReport(stringToBeMatched, patternString);
		

		
		
		patternString = "(?=.*test)(?=.*long)";
		stringToBeMatched = "This is a very long sentence used as a test";
		printReport(stringToBeMatched, patternString);
		
		
		patternString = "(?i)(\\btest\\b.*\\blong\\b|\\blong\\b.*\\btest\\b)";
		stringToBeMatched = "This is a very long sentence used as a test";
		printReport(stringToBeMatched, patternString);
		
		patternString = "^(?=.*\\b(?i)jack\\b)(?=.*\\b(?i)james\\b).*$";
		stringToBeMatched = "hi jAMes here is  		jAck";
		printReport(stringToBeMatched, patternString);
		
		
		patternString = "^(?=.*\\b(?i)jack\\b)(?=.*\\b(?i)james\\b).*$";
		stringToBeMatched = "JAMES  		jAck";
		printReport(stringToBeMatched, patternString);
		
		
		patternString = "^(?=.*\\b(?i)jack\\b)(?=.*\\b(?i)james\\b).*$";
		stringToBeMatched = "JAMES  		jack";
		printReport(stringToBeMatched, patternString);
//		patternString =  "\\bone\\b/ && \\btwo\\b/  && \\bthree\\b";
//		stringToBeMatched = "one,two,three";
//		printReport(stringToBeMatched, patternString);
		
		
		patternString = "^(?=.*\\b(?i)jack\\b)(?=.*\\b(?i)james\\b)(?=.*\\b(?i)java\\b).*$";
		stringToBeMatched = "JAMES  	JAVA	jack";
		printReport(stringToBeMatched, patternString);

		
	}
	
	private static void printReport(String stringToBeMatched, String patternString) {
		System.out.println("============");
		System.out.println("stringToBeMatched is: " + stringToBeMatched);
		System.out.println("patternString is: " + patternString);
		System.out.println("Match is:"+ test(stringToBeMatched, patternString));
		
	}
	
	private static boolean test(String stringToBeMatched, String patternString) {
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(stringToBeMatched);
		return m.matches();
	}
}
