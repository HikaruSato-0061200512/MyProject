package question26;

public class Practice {
	public static void main(String[] args) {
	
	//人間クラスのオブジェクトを生成
	Human human = new Human();
	
	//setName()メソッドに引数を設定
	human.setName("田中太郎");
	
	//メソッドを呼び出して、.lengthで文字数を出力している
	System.out.println(human.getName().length());

	}

}
