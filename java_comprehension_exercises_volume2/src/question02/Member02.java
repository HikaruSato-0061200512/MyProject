package question02;

public class Member02 {
	
	/**
	 * (1)
	 * 表3のフィールドを作成
	 */
	String name;
	int age;
	int authority;
	int[] coupon;
	
	/**
	 * (2)
	 * 表３のshowメソッドを作成
	 */
	void show() {
		//introductioメソッドを呼び出す
		this.introduction();
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "歳です。");
	}
	
	/**
	 * (3)
	 * 表３のintroductionメソッドを作成
	 */
	void introduction() {
		System.out.println("会員の簡単な紹介をします。");
	}
	
	//(7)表3のconfirmationメソッドを作成
	int confirmation() {
		return this.authority;
	}
	
	
	//(8)表３のchangeCouponメソッドを作成
	int[] changeCoupon(int number) {
		System.out.println("クーポンの数を変更します。");
		this.coupon = new int[number];
		return this.coupon;
	}

}
