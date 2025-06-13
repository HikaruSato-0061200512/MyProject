package question05;

public class Telephone {
	
	/*
	 * (1)
	 * 表７のフィールドを作成
	 */
	
	protected String phoneNumber;
	protected int fee;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	/*
	 * (4)
	 * メソッドに処理内容を追加
	 */
	void showInfo() {
		System.out.println("Telephone クラスで格納されている電話番号は" + this.phoneNumber + "で、料金は" + this.fee + "円です。");
		
		
	}
	

}
