
package main;

public class Card2 {

	private String mark;
	private int number;

	public void Card(String mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public String getMarkString() {
		// String[] name = {"スペード","ハート","クラブ","ダイヤ"};
		return mark;
	}

	public int getNumber() {
		return number;
	}

}
