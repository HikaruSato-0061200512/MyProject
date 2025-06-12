package question03;

public class Teacher {

	/**
	 * (5)
	 * 表5の通りに作成
	 */
	
	String name;
	int age;
	String address;
	
	String getAddress() {
		return address;
	}
	
	void setTuacherInfo(String name) {
		this.name = name;
	}
	
	void setTeacherInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setTeacherInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
}
