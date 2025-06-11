package question01;

public class SystemMain01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		//りんごの変数 値段 初期値100
		int applePrice = 100;
		
		//文房具の変数 初期値 鉛筆
		String stationery = "鉛筆";
		
		/**
		 * 変数の値の変更
		 * int型の変数applePriceに200を代入
		 */
		applePrice = 200;
		
		//String型の変数stationeryに文字列を代入
		stationery = "消しゴム";
		
		/**
		 * （３）
		 * int型の変数bananaPriceを初期化 初期値 applePrice
		 */
		int bananaPrice = applePrice;
		
		//String型の変数 初期化 初期値 stationery
		String writingUtensils = stationery;
		
		/**
		 * （４）
		 * 出力
		 */
		
		System.out.println("りんごの値段は" + applePrice + "です。");
		System.out.println("バナナの値段は" + bananaPrice + "です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");
		
		

	}

}
