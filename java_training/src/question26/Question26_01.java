package question26;

public class Question26_01 {
	public static void main(String[] args) {
		
		//例外処理
		try {
		String str = "こんにちは";
		int num = Integer.parseInt(str);
		System.out.println("変換したら" + num + "になりました");
		
		//catch(エラー文のクラス名 変数名)の形で書く
	} catch (NumberFormatException e) {
		//例外が発生した時に実行する文
		System.out.println("例外が発生しました");
	} 
}
	
}