package main;

public class Card {

	private Mark mark;
	private int number;

	public Card(Mark mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public static Card createJoker() {
		return new Card(Mark.JOKER, 14);

	}

	public int getNumber1() {
		return number;
	}

	public Mark getMark() {
		return mark;
	}

	public String getNumber2() {
		String sheet;
		switch (number) {
		case 11:
			sheet = "ジャック";
			break;
		case 12:
			sheet = "クイーン";
			break;
		case 13:
			sheet = "キング";
			break;
		case 1:
			sheet = "エース";
			break;
		default:
			sheet = Integer.toString(number);
			break;
		}
		return sheet;
	}
}
