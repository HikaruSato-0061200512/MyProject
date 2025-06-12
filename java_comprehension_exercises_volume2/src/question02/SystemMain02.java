package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		//インスタンスを生成
		Member02 memberA = new Member02();
		
		//memberAのフィールドに代入
		memberA.name = "田中";
		memberA.age = 20;
		memberA.authority = 1;
		memberA.coupon = new int[2];
		
		//memberAのshowメソッドを呼び出す
		memberA.show();
		
		//memberAのshowメソッドを呼び出す
		memberA.show();
		
		/**
		 * (4)
		 * Member02クラスの君スタンスを生成
		 */
		Member02 memberB = new Member02();
		
		//Administrator02クラスのインスタンスを生成
		Administrator02 adminA = new Administrator02();
		
		//adminAのフィールドに値を代入
		adminA.password = 123;
		adminA.member02 = memberB;
		
		//member02のフィールドに代入
		adminA.member02.name = "加藤";
		adminA.member02.age = 30;
		adminA.member02.authority = 2;
		adminA.member02.coupon = new int[5];
		
		//adminAのchangePassメソッドを呼び出す
		adminA.changePass(456);
		
		
		//標準出力
		System.out.println("会員情報を変更します。");
		System.out.println("名前を入力してください。");
		
		//標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//1行ずつ読み込む
		String name = reader.readLine();
		
		//標準出力
		System.out.println("年齢を入力してください。");
		
		//1行ずつ入力値を読み込み、数値型にする
		int age = Integer.parseInt(reader.readLine());
		
		//adminAのメソッドを呼び出す
		adminA.changeStatus(name, age);
		adminA.show();
		
		//adminAのメソッドを呼び出す
		adminA.showCoupon(memberA);
		adminA.showCoupon(memberB);
		
		//標準出力
		System.out.println(memberA.name + "さんの権限を確認します。");
		
		//Member02のconfirmationメソッドを呼び出して、suthorityに戻り値を代入
		int authority = memberA.confirmation();
		
		//条件分岐
		if (authority == 1) {
			System.out.println("権限は一般会員です。");
		} else if (authority == 2) {
			System.out.println("権限は管理者です。");
		} else {
			System.out.println("権限は登録されていません。");
		}
		
		//memberAのchangeCouponメソッドを呼び出し、配列変数cewCouponに戻り値を代入
		int[] newCoupon = memberA.changeCoupon(7);
		
		//標準出力
		System.out.println("クーポンの数は" + newCoupon.length + "個です。");
		
		
		
		
		
		
		
		

	}

}
