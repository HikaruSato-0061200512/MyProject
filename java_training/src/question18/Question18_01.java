package question18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question18_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//現在の時刻を取得
		Date date = new Date();
		
		//書式文字列を指定した現在時刻の出力
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("今日の日付を表示します。");
		System.out.println(sdf.format(date));
		
		

	}

}
