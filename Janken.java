
public class Janken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//じゃんけんの手
		String[] hand = {"グー","チョキ","パー"};
		
		
		//じゃんけん
		//じゃんけんの手を決める
		int comA = new java.util.Random().nextInt(3);
		int comB = new java.util.Random().nextInt(3);
		
		
		//手を表示
		System.out.println("ComAは、" + hand[comA]);
		System.out.println("ComBは、" + hand[comB]);

		
		//ComA勝ちパターン
		if( ( comA == 0 && comB == 1 )
		 || ( comA == 1 && comB == 2 )
		 || ( comA == 2 && comB == 0 )) {
			
			System.out.println("ComA の勝ちです。");
	
		//ComB 勝ちパターン
		} else if( ( comB == 0 && comA == 1 )
			    || ( comB == 1 && comA == 2 )
			    || ( comB == 2 && comA == 0 ) ) {
			
			System.out.println("ComB の勝ちです。");
			
		} else {
		
			System.out.println("あいこです。");
		}
		
	}

}
