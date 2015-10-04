package task12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

	public static ArrayList<Cell> composeWordList(String text) {

		ArrayList<Cell> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("(\\b[\\wА-Яа-я]+\\b)");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String word = matcher.group();
			Cell findRes = new Cell(word);
			if (list.contains(findRes)) {
				int index = list.lastIndexOf(findRes);
				Cell temp = list.remove(index);
				temp.setCount(temp.getCount() + 1);
				list.add(temp);
			}else {
				findRes.setCount(1);
				list.add(findRes);
			}
		}
		return list;
	}

	private static void print(ArrayList<Cell> arrayList) {
		if(arrayList != null) {
			System.out.printf("%n%15s %12s%n%n","Word", "Count");
			for(Cell obj : arrayList)
			{
				System.out.printf("%15s | %10d%n", obj.getWord(),obj.getCount());
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Cell> list = composeWordList("helвм helвм   привет привет привет привет "
				+ "привет привет привет привет привет привет "
				+ "привет моя дорогая 12 мама. привет моя любимая сестра");
		print(list);
	}

}
