
package main;

public class Card2 {

	private String mark;
	private int number;
	
	public	void Card(String mark, int number){
		this.mark 	= mark;
		this.number	= number;
	}
	
		
		
		
		/*public  enum mark{
		SPADE("スペード", 4), 
		CLOVER("クローバー", 3), 
		DIA("ダイヤ", 2), 
		HEART("ハート", 1), 
		JOKER("ジョカー", 5);
		*/

		
		public int getNumber() {
			return number;
		}
		public String grtMark() {
			return mark;
			}
	
		
		
		
		
		
	
	}
}
