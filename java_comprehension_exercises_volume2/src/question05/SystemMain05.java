package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		//(2)変数を宣言
		String phoneNumber;
		int fee;
		double internetSpeed;
		
		//SmartPhoneクラスをインスタンス化
		SmartPhone phoneA = new SmartPhone();
		
		//標準出力
		System.out.println("電話番号を入力してください。");
		
		//標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		phoneNumber = reader.readLine();
		
		//標準出力
		System.out.println("料金を入力してください。");
		
		//標準入力 一行ずつ読み込み、数値型に変換
		fee = Integer.parseInt(reader.readLine());
		
		phoneA.setPhoneNumber(phoneNumber);
		phoneA.setFee(fee);
		
		/**
		 * (3)
		 * 標準出力
		 */
		
		System.out.println("通信速度を入力してください。");
		
		//標準入力 一行読み込み double型に変換
		internetSpeed = Double.parseDouble(reader.readLine());
		
		phoneA.setInternetSpeed(internetSpeed);
		
		
		/**
		 * (5)
		 * Telephoneクラスのインスタンスを生成
		 */
		Telephone phoneB = new Telephone();
		
		//phoneBのメソッドを呼び出す
		phoneB.setPhoneNumber("0123456789");
		phoneB.setFee(9);
		
		//phoneAのメソッドを呼び出す
		phoneA.showInfo();
		
		//phoneBのメソッドを呼び出す
		phoneB.showInfo();

		
		/**
		 * (6)
		 * 条件分岐
		 * equals()メソッドで比較
		 */
		if (phoneA.equals(phoneB)) {
			System.out.println("同じオブジェクトを参照しています。");
		} else {
			System.out.println("違うオブジェクトです。");
		}
		
		//[==]で比較
		if (phoneA == phoneB) {
			System.out.println("同じ型を参照しています。");
		} else {
			System.out.println("違う型です。");
		}
		
		
		
		
		
		
		
	}

}
