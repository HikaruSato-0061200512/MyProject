package question12;

public class Dog {

	void showName(String n) {
		System.out.println("名前は" + n + "です");
	}
	
	//メソッドの追加
	void showAge(int age) {
		System.out.println("年齢は" + age + "歳です");
	}
	
	void showProfile(int age, String food) {
		System.out.println("年齢は" + age + "歳、好きな食べ物は" + food + "です");
	}

}
