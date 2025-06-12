package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		/**
		 * (2)
		 * Studentクラスをインスタンス化
		 */
		Student studentA = new Student();
		
		//標準出力
		System.out.println("studentAの名前を入力してください。");
		
		//標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//1行ずつ読み込む
		String name = reader.readLine();
		
		//StudentAクラスのメソッドを使ってフィールドnameに格納
		studentA.setName(name);
		
		//標準出力
		System.out.println("studentAの年齢を入力してください。");
		
		//1行ずつ読み込んで、数値型に変換
		int age = Integer.parseInt(reader.readLine());
		
		//StudentAクラスのメソッドを使ってフィールドageに格納
		studentA.setAge(age);
		
		/**
		 * (3)
		 * Student クラスのインスタンス（変数名 studentB）を任意の文字列と整数値を引数として設定した状態で 1 つ生成
		 */
		Student studentB = new Student("佐藤", 25);
		
		/**
		 * (4)
		 * 標準出力
		 */
		System.out.println("studentA の名前は" + studentA.getName() +  "、年齢は" + studentA.getAge() + "です。");
		System.out.println("studentBの名前は" + studentB.getName() + "、年齢は" + studentB.getAge() + "です。");
		System.out.println("Studentクラスで生成したオブジェクトの数は" + Student.getTotalStudent() + "です。");
		
		
		/**
		 * (5)
		 * Teacherクラスのインスタンスを生成
		 */
		Teacher teacherA = new Teacher();
		
		//標準出力
		System.out.println("teacherA の名前を入力してください。");
		
		//一行ずつ読み込む
		String teacherName = reader.readLine();
		
		//標準出力
		System.out.println("teacherA の年齢を入力してください。");
		
		//入力された値を、数値型に変換
		int teacherAge = Integer.parseInt(reader.readLine());
		
		//標準出力
		System.out.println("teacherA の住所を入力してください。");
		
		//一行ずつ読み込む
		String teacherAddress = reader.readLine();
		
		//setTeacherInfoメソッドを呼び出す
		teacherA.setTeacherInfo(teacherName, teacherAge, teacherAddress);
		
		//標準出力
		System.out.println("teacherAの住所は" + teacherA.getAddress() + "です。");
		
		
		
		
		

	}

}
