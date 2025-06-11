package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		/**
		 * （１）
		 * 標準出力
		 */
		
		System.out.println("名前を入力してください");
		
		//標準入力設定
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//入力したものをnameに代入
		String name = reader.readLine();
		
		//出力
		System.out.println("あなたの名前は" + name + "です。");
		
		
		/**
		 * (2)
		 * 標準出力
		 */
		
		System.out.println("年齢を入力してください。");

		//入力したものを変数に代入
		String temporaryAge = reader.readLine();
		
		//型変換
		int age = Integer.parseInt(temporaryAge);
		
		//標準出力
		System.out.println("あなたの名前は" + age + "歳です。");
		
		
		/**
		 * (3)
		 * 標準出力
		 */
		System.out.println("好きな食べ物と飲み物を入力してください");
		
		//入力したものを変数に代入
		String food = reader.readLine();
		String drink = reader.readLine();
		
		//標準出力
		System.out.println("あなたの好きな食べ物は" + food + "です。");
		System.out.println("あなたの好きな飲み物は" + drink + "です。");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
