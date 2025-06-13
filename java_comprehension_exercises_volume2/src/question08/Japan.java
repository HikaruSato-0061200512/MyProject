package question08;
/*
 * (2)例外を送出
 * ArrayIndexOutOfBoundsExceptionの例外が発生するかもしれないと、宣言している
 * throws文はメソッドの定義で使う
 * 呼び出し元でtry-catchする
 */
public class Japan {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] japanese = new String[3];
		japanese [1] = "こんにちは";
		japanese [2] = "こんばんは";
		System.out.println(japanese [1].toString());
		System.out.println(japanese [3].toString());
		

	}

}
