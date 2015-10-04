package task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterReplace {

	public static String execute(String text) {
		text = text.toUpperCase();
		Pattern pattern = Pattern.compile("(\\w*?P\\w*?)A(\\w*?)");
		Matcher matcher = pattern.matcher(text);
		text = matcher.replaceAll("$1O$2");
		System.out.println(text);
		return text;
	}
	
	public static void main(String[] args) {
		execute("mama, papa? Prepare  potato!!!!");
	}

}
