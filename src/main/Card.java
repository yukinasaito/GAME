package main;

public class Card {

	private Mark mark;
	private int number;

	public Card(Mark mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Mark getMark() {
		return mark;
	}

}
