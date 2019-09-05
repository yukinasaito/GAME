package main;

public class Card {

	private Mark mark;
	private int number;

	public Card(Mark mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public int getNumber1() {
		return number;
	}

	public Mark getMark() {
		return mark;
	}

	public String getNumber2() {
		String suit;
		switch (number) {
		case 11:
			suit = "ジャック";
			break;
		case 12:
			suit = "クイーン";
			break;
		case 13:
			suit = "キング";
			break;
		case 1:
			suit = "エース";
			break;
		default:
			suit = Integer.toString(number);
			break;
		}
		return suit;
	}

}
