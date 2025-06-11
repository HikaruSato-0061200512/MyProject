package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain04 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		/**
		 * (1)
		 * intの要素数を5つもつ配列
		 */
		int[] ageGroup1 = new int[5];
		
		//配列に要素を代入
		ageGroup1[0] = 22;
		ageGroup1[1] = 18;
		ageGroup1[2] = 24;
		ageGroup1[3] = 19;
		ageGroup1[4] = 20;
		
		/*
		 * (2)
		 * 標準出力
		 */
		System.out.println("配列ageGroup1の3番目の人の新しい年齢を入力してください");
		
		//標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//入力した値を変数に代入
		String temporaryAge = reader.readLine();
		
		//入力した値をint型に変換
		int age = Integer.parseInt(temporaryAge);
		
		//3番目の要素に変数ageを代入
		ageGroup1[2] = age;
		
		//標準出力
		System.out.println("配列ageGroup1で3番目の人の年齢は" + ageGroup1[2] + "歳です。");
		
		/**
		 * int型の要素数を6つもつ配列
		 */
		int[] ageGroup2 = {23, 33, 26, 21, 25, 22};
		
		//標準出力
		System.out.println("配列 ageGroup2 で 4 番目の人の年齢は" + ageGroup2[3] + "歳です。");
		
		//配列 ageGroup2 の 4 番目の要素に配列 ageGroup1 の 4 番目の要素の値を代入
		ageGroup2[3] = ageGroup1[3];
		
		//標準出力
		System.out.println("配列 ageGroup2 で 4 番目の人の年齢は" + ageGroup2[3] + "歳です。");
		
		/**
		 * (4)
		 * 配列の長さを求める
		 */
		
		System.out.println("配列 ageGroup1 の要素数は" + ageGroup1.length + "人です。");
		System.out.println("配列 ageGroup2 の要素数は" + ageGroup2.length + "人です。");
	}

}
