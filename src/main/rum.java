package main;

public class rum {

	private static final Mark Number = null;
	private static final String Syatem = null;

	public static void main(String[] args) {

		Card card = new Card(Mark.CLOVER, 13);
		System.out.println(card.getNumber1());
		System.out.println(card.getMark());

		Deck deck = new Deck();
		deck.shuffle();

		Card card2 = deck.draw();
		System.out.println(card2.getNumber1());
		System.out.println(card.getMark());
	}

}
