package question11;

public class Question11_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Catクラスをオブジェクト化
		Cat cat = new Cat();
		
		//Catクラスのフィールドに値を代入
		cat.height = 52.3;
		cat.weight = 4.8;
		cat.food = "ささみ";
		
		System.out.println("身長は" + cat.height + "㎝です");
		System.out.println("体重は" + cat.weight + "kgです");
		System.out.println("好きな食べ物は" + cat.food + "です");

	}

}
