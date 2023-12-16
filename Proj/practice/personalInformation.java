
public class personalInformation {
	private String name;
	private String adress;
	private int age;
	private String phoneNum;
	
	public personalInformation(String name, String adress, int age, String phoneNum) {
		this.name = name;
		this.adress = adress;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
	public String toString() {
		return String.format("Personal Information: \nName = %s \nAdress = %s \nAge = %s  \nPhone Number = %s", name, adress, age,
				phoneNum);
	}	
	
	public static void main(String[] args) {
		personalInformation user1 = new personalInformation("Smit Patel", "341 Applegate Drive", 15, "913-426-1095");
		personalInformation user2 = new personalInformation("Dhruv Tomar", "512 Smokewood Avenue", 15, "913-742-2928");
		personalInformation user3 = new personalInformation("Evan Yersk", "698 Laurenwood Street", 15, "732-335-1142");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		

		

	}

}
