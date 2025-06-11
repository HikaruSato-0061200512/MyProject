package question03;

public class SystemMain03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/**
		 * (1)
		 * 初期化
		 * 値段を表す変数
		 */
		int price = 30;
		
		//合計金額を表す変数
		int totalPrice = 300;
		
		//初期値：totalPriceからpriceの値で助産した値、購入数を表す変数
		int quantity = totalPrice / price;
		
		//出力
		System.out.println("商品の購入数は" + quantity + "個です。");
		
		
		/**
		 * (2)
		 * 初期化
		 * 初期値：priceに100を加算した値、新しい値段を表す変数
		 */
		int newPrice = price + 100;
		
		//初期値：quantiryにデクリメントした、新しい購入数を表す変数
		int changeQuantity = --quantity;
		
		//代入演算子で加算代入(newPriceとPrice)
		newPrice += price;
		
		//代入値：newPriceとquantityを乗算した変数
		totalPrice = newPrice * quantity;
		
		//出力
		System.out.println("商品の購入数は" + changeQuantity + "個です。");
		System.out.println("商品の新しい値段は" + newPrice + "円に変更です。");
		System.out.println("商品の購入合計金額は" + totalPrice + "円です。");
		
		
		/**
		 * (3)
		 * 初期化 初期値：1.1、値上げ率を表す変数
		 */
		double priceIncreaseRate = 1.1;
		
		//初期化 初期値：newPriceを1割り増しの値で設定、int型へキャスト、値上げ後の値段を表す
		int changePrice = (int) (newPrice * priceIncreaseRate);
		
		//出力
		System.out.println("商品の元の値段は" + newPrice + "円です。");
		
		System.out.println("商品の値上げ後の値段は" + changePrice + "円です。");
		
		
		
	}

}
