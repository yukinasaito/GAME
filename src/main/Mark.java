package main;

public enum Mark {
	SPADE("スペード", 4), CLOVER("クローバー", 3), DIA("ダイヤ", 2), HEART("ハート", 1), JOKER("ジョカー", 0);

	private String Name;
	private int priority;

	Mark(String Name, int priority) {
		this.Name = Name;
		this.priority = priority;
	}
};
