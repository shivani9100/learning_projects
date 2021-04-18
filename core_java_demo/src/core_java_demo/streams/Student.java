package core_java_demo.streams;

public class Student {

	private String name;
	private int rollNum;
	private String clgName;
	private String city;
	private String group;
	
	public Student() {}

	public Student(String name, int rollNum, String clgName, String city, String group) {
		this.name = name;
		this.rollNum = rollNum;
		this.clgName = clgName;
		this.city = city;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
