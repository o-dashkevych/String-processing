package task12;

public class Cell {
	
	private String word;
	
	private int count;

	public Cell(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj.getClass() == this.getClass()) {
				Cell objRef = (Cell) obj;
				if(objRef.word.equals(this.word))
					return true;
			}
		}
		return false;
	}

	public Cell(String word) {
		super();
		this.word = word;
	}

	@Override
	public int hashCode() {
		int hashcode = this.count * 32;
		hashcode += this.word.hashCode() * 32;
		return hashcode;
	}	
}
