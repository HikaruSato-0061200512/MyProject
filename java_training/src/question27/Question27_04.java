package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ArrayListをオブジェクト化
		List<String> std = new ArrayList<>();
		
		//リストに要素を追加する
		std.add("Java基礎");
		std.add("Java応用");
		
		//要素を削除する
		std.remove(1);
		
		System.out.println(std.size());
		

	}

}
