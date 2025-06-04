package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ArrayListを使うことで要素数を柔軟に増減できる
		//ArrayListのオブジェクトを生成
		List<String> fruits = new ArrayList<>();
		
		//変数名.add()で要素を追加
		fruits.add("みかん");
		fruits.add("ぶどう");
		fruits.add("いちご");
		
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		
		
	}

}
