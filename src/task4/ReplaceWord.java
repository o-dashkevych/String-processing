package task4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWord {

	private static String executeString(String text, int wordLength, String replacement) {
		Pattern pattern = Pattern.compile("\\b(\\w|[А-Яа-я]){" + wordLength + "}\\b");
		Matcher matcher = pattern.matcher(text);
		text = matcher.replaceAll(replacement);		
		return text;				
	}
	
	public static void main(String[] args) {
		String text = executeString("Papa greeted me with this good present. Папа поздравил меня этим чудесным подарком", 4, "HUIWAM");
		System.out.println(text);
	}
}
