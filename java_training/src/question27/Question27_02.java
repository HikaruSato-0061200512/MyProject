package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ArrayListをオブジェクト化
		List<String> animals = new ArrayList<>();
		
		//要素を追加
		animals.add("イヌ");
		animals.add("クマ");
		animals.add("フクロウ");
		
		//要素を削除
		animals.remove(1);
		
		System.out.println("動物は" + animals + "がいます。");

	}

}
