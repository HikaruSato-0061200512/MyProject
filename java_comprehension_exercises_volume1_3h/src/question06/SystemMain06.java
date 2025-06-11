package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		/**
		 * (1)
		 *for文
		 */
		
		for (int i = 1; i <= 4; ++i) {
			System.out.println("繰り返します。");
		}
		System.out.println("繰り返しが終了しました。");
	
	/**
	 * (2)
	 * 5つの要素数をもつ配列
	 */
	String[] studentName = {"かなこ", "ゆうた", "あい", "はるひ", "かずき"};
	
	//拡張for文
	for (String name : studentName) {
		System.out.println(name);
	}
	
	/**
	 * (3)while文
	 * 初期化 初期値0 鉛筆の個数を表す変数
	 */
	
	int amount = 0;
	
	//初期値 100 鉛筆の値段を表す変数
	int price = 100;
	
	//標準出力
	System.out.println("鉛筆を購入しますか?");
	System.out.println("はい：０、いいえ：１ ＞");
	
	//標準入力し、数値型に変換
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int buyFlag = Integer.parseInt(reader.readLine());
	
	//while文
	while (buyFlag == 0) {
		amount++;
		System.out.println("購入する鉛筆の個数を１つ増やしますか");
		System.out.println("はい：０、いいえ：１ ＞");
		buyFlag = Integer.parseInt(reader.readLine());
	} 
	System.out.println("購入した鉛筆の個数は" + amount + "個です。");
	System.out.println("従って、合計金額は" + (amount * price) + "円です。");
	
	
	/**
	 * (4)
	 * 初期化 初期値 0 本の冊数を表す
	 */
	
	int amountBooks = 0;
	int sellFlag = 0;
	int bookPrice = 200;
	
	System.out.println("本を売却します。");
	
	//do while文
	do {
		amountBooks++;
		System.out.println("売却する本の冊数を１つ増やしますか？");
		System.out.println("はい：０、いいえ：１ ＞");
		sellFlag = Integer.parseInt(reader.readLine());
	} while (sellFlag == 0);
	System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
	System.out.println("従って、合計金額は" + (amountBooks * bookPrice) + "円です。");
	}
	
}
	
	
	
	
