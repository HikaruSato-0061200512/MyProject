package question08;

//(1)try-catch-finally

public class Animal {
	public static void main(String[] args) {
		
		try {
		String[] animals = new String[3];
		animals [1] = "Dolphin";
		animals [2] = "Whale";
		animals [3] = "Penguin";
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素を超えています。");
		}
		
	}
	
}
