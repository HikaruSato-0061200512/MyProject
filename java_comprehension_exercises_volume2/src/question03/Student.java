package question03;

public class Student {
	
	/**
	 * (1)a
	 */
	private String name;
	private int age;
	static int totalStudent;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getTotalStudent() {
		return totalStudent;
	}
	public static void setTotalStudent(int totalStudent) {
		Student.totalStudent = totalStudent;
	}
	
	//bコンストラクタを作成
	Student() {
		totalStudent++;
	}
	
	
	/**
	 * (3)
	 * コンストラクタを作成
	 */
	Student(String name, int age) {
		this();
		this.setName(name);
		this.setAge(age);
	}
	
	
	
	
	
	
	
	
	

}
