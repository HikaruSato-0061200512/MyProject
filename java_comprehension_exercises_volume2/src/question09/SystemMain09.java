package question09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SystemMain09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//(1)ArrayListを宣言
		List<String> thingsToBuyList = new ArrayList<>();
		
		//Listに値を追加
		thingsToBuyList.add("牛乳");
		thingsToBuyList.add("卵");
		thingsToBuyList.add("パン");
		
		//(2)
		thingsToBuyList.remove(1);
		
		//(3)
		System.out.println(thingsToBuyList.get(1) + "が次に買うものです。");
		
		//(4)HashMapを宣言
		HashMap<Integer, String> colorMap = new HashMap<>();
		
		//Mapに値を追加
		colorMap.put(1, "赤");
		colorMap.put(2, "青");
		colorMap.put(3, "黄");
		
		colorMap.remove(1);
		
		System.out.println("colorMap の要素の数は" + colorMap.size() + "個です。");
		
		colorMap.clear();
		
		System.out.println("colorMap の要素が空かどうかの判定は" + colorMap.isEmpty() + "です。");
		
		
		
		
		

	}

}
