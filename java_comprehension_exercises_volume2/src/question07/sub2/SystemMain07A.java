package question07.sub2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import question01.Member01;
import question07.sub1.Car;

public class SystemMain07A {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		//別パッケージのCarクラスをインスタンス化
		Car carA = new Car();
		
		//(3)
		System.out.println("名前を入力してください。");
		
		//標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		
		//Member01クラスのインスタンスを生成
		Member01 memberA = new Member01();
		
		memberA.newName = name;
		
		System.out.println("あなたの名前は" + memberA.newName + "です。");
		
		
		
		
		
		
		
		
	}

}
