package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	private final List<Card> cards = new ArrayList<Card>();

	public Deck() {
		List<Card.Mark> mark = Arrays.asList(
				Card.Mark.SPADE,
				Card.Mark.DIA,
				Card.Mark.HEART,
				Card.Mark.CLOVER);

		mark.forEach(mark -> {
			for(int number = 1; number <= 13; number++) {
				Card card = new Card(mark, number);
				cards.add(card);
			}
		});

	}

	public void shuffle() {
		// ここにコードを挿入
		Collections.shuffle(cards);
	}

}
