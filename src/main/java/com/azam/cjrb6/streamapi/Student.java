package com.azam.cjrb6.streamapi;

public class Student {
	private String name;
	private int age;
	private int rollNumber;
	private String gender;
	private String stream;
	private int score;

	public Student() {

	}

	public Student(String name, int age, int rollNumber, String gender, String stream, int score) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.gender = gender;
		this.stream = stream;
		this.score = score;
		;
	}

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

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", gender=" + gender
				+ ", stream=" + stream + ", score=" + score + "]";
	}

}
