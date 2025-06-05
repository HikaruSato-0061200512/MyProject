package question26;

public class InputPasswordException extends Exception {
	
	//エラーメッセージを表示
	
	public InputPasswordException() {
		super("パスワードは４文字以上８文字以下で入力してください。");
	}

}
