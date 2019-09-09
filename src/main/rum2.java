package main;

public class rum2 {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		for(int i = 0; i < 54; i++) {

			Card card = deck.draw();
			System.out.println(card.getNumber1() + card.getMark().name());

		}
	}
}
