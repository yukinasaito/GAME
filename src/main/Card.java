package main;

public class Card  {
	private Mark mark;
	private int number;

public class Mark {
	SPADE("スペード",４),CLOVER("クローバー",３),DIA("ダイヤ",2),HEART("ハート",1),JOKER("ジョカー",0);
	
	private int Num;
	private String Name;
	
	Mark(String Name , int priority ){
		this.Name = Name;
		this.priority = priority
}
};

public Card(Mark mark, int number) {
	this.mark = mark;
	this.number = number;
}
	
	
	
	

	

	













	public Card(Mark mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public static Card createJoker() {
		return new Card(Mark.JOKER, 0);
	}

	public String getMark() {
		return mark.Name;
	}

	public String getNumber() {
		String str;
		switch (number) {
		case 11:
			str = "ジャック";
			break;
		case 12:
			str = "クイーン";
			break;
		case 13:
			str = "キング";
			break;
		case 1:
			str = "エース";
			break;
		default:
			str = Integer.toString(number);
			break;
		}
		return str;
	}

	public String getMarkAndNumber() {
		String str;
		if(this.isJoker()) {
			str = getMark();
		}else {
			str = getMark() + "の" + getNumber();
		}
		return str;
	}