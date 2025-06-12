package question04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemMain04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//(1)クラスライブラリ
		String phoneNumber = "12-3456-7890";
		String message = "今日は晴れです。";
		String annotation = "ただし、午後からの降水確率は 70%です。";
		
		//標準出力
		System.out.println("１文字ずつ表示します。");
		
		//繰り返し文
		for(int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i));
		}
		
		//標準出力
		System.out.println("文字列を連携します。");
		
		//String 型の変数 sconcat に変数 message と変数 annotation を文字列連結した値を代入
		String sconcat = message + annotation;
		
		//標準出力
		System.out.println("連結した文字列：" + sconcat);
		
		/**
		 * (2)
		 */
		System.out.println("ランダムな数字を表示します。");
		
		Random rand = new Random();
		double number = rand.nextDouble();
		
		System.out.println(number);
		
		//(3)
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M月dd日E曜日");
		System.out.println("今日の日付を表示します。");
		System.out.println(sdf.format(date));
		
		//(4)入力チェックを行うクラス
		Pattern p = Pattern.compile("^[0-9]{2}-[0-9]{4}-[0-9]{4}$");
		
		//パターンにマッチしているかを比較
		Matcher m = p.matcher(phoneNumber);
		
		if(m.find()) {
			System.out.println("パターンと一致しています。");
		}else {
			System.out.println("正しい番号ではありません。");
		}
		

	}

}
