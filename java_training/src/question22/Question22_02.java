package question22;

public class Question22_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//オブジェクトを作成
		String frog1 = "カエル";
		
		//frog1が保存されたStringBuilderクラスのオブジェクトを作成
		StringBuilder stringBuilder = new StringBuilder(frog1);
		
		//同じ型出ないと比較することができないため、StringBuilder型をString型に変換している
		String frog2 = stringBuilder.toString();
		
		//オブジェクトの型の比較は「==」等値を使う
		if (frog1 == frog2) {
			System.out.println("変数frog1と変数frog2は同じものです。");
		} else {
			System.out.println("変数frog1と変数frog2は違うものです。");
		}
		
		
		//オブジェクト内の値を比較はequals()メソッドの等価使う
		if (frog1.equals(frog2)) {
			System.out.println("変数frog1と変数frog2は同じものです。");
		} else {
			System.out.println("変数frog1と変数frog2は違うものです。");
		}
		
	}

}
