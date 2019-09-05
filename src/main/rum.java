package main;

public class rum {

	private static final Mark Number = null;
	private static final String Syatem = null;

	public static void main(String[] args) {

		Card card1 = new Card(Mark.CLOVER, 13);
		Card card2 = new Card(Mark.CLOVER, 13);
		System.out.println(card2.getNumber1());
		System.out.println(card2.getMark());

		Deck deck = new Deck();
		deck.shuffle();

		Card card3 = deck.draw();
		System.out.println(card3.getNumber1());
		System.out.println(card3.getMark());
	}

}
