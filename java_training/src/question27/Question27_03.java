package question27;

import java.util.HashMap;
import java.util.Map;

public class Question27_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 * 整数値以外の形式で管理したい時に使う
		 * HashMapはキーと値のペアを1つの要素として管理する
		 */
		
		//String型のキー,String型の値
		Map<String, String> map = new HashMap<>();
		
		//mapにキーと値を追加する
		map.put("田中太郎", "昭和");
		map.put("鈴木二郎", "平成");
		map.put("渡辺花子", "平成");
		
		System.out.print("田中太郎さんは");
		System.out.println(map.get("田中太郎") + "生まれです。");
		
		System.out.println("鈴木二郎さんは" + (map.get("鈴木二郎") + "生まれです。"));
		
		System.out.println("渡辺花子さんは" + (map.get("渡辺花子") + "生まれです。"));
		
		
		

	}

}
