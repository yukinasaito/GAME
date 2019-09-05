package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<Card> cards = new ArrayList<Card>();

	public Deck() {
		List<Mark> marks = Arrays.asList(
				Mark.SPADE,
				Mark.DIA,
				Mark.HEART,
				Mark.CLOVER);

		marks.forEach(mark -> {
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

	public Card draw() {
		Card card = null;
		if(cards.size() > 0) {
			int index = cards.size() - 1;
			card = cards.get(index);
			cards.remove(index);
		}
		return card;
	}

	public void put(Card card) {

	}
}