package task2;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RusAlphabet {

	public static LinkedList<Integer> getAlphabetNumbers(String text) {
		LinkedList<Integer> codes= new LinkedList<Integer>();
		Pattern pattern = Pattern.compile("[Р-пр-џ]{1}");
		text = text.toLowerCase();
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			char letter = matcher.group().charAt(0);
			int code = (int)letter  - (int)'р' + 1;
			codes.add(code);
		}
		return codes;
	}
	
	public static void output(String text) {
		LinkedList<Integer> codes = getAlphabetNumbers(text);
		char[] textChars = text.toCharArray();
		for (char c : textChars) {
			System.out.print(String.valueOf(c) + "  ");
		}
		System.out.println();
		for (Integer integer : codes) {
			if(integer.intValue() > 9) {
				System.out.print(integer.intValue() + " ");
			}
			else {
				System.out.print(integer.intValue() + "  ");
			}
		}
	}
	
	public static void main(String[] args) {
		output("Рдстуfф");
	}
}
