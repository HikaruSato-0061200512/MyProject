package question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * (3)throw文
 * 
 *
 */
public class SystemMain08 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("入力してください。");
		String input = reader.readLine();
		
		try {
		//static メソッド check を呼び出す（実引数：input）
			check(input);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("文字列が空なので、数値に変換できません。");
		
	}

	//checkメソッドの処理内容
	private static void check(String receive) throws NumberFormatException {
		//条件分岐
		if (receive.isEmpty()) {
			throw new NumberFormatException("文字列が空なので、数値に変換できません。");
		} else {
			System.out.println("入力できています。");
		}
		
	}

}
