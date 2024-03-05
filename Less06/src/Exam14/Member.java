package Exam14;

public class Member {
	private int num;
	private String userName;
	private String userEMail;
	private boolean gender;
	private int count;
	private String address;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEMail() {
		return userEMail;
	}
	public void setUserEMail(String userEMail) {
		this.userEMail = userEMail;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	@Override
	public String toString() {
		return "Member [num=" + num + ", userName=" + userName + ", userEMail=" + userEMail + ", gender=" + gender
				+ ", count=" + count + ", address=" + address + ", age=" + age + "]";
	}
}
