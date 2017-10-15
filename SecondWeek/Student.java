package com.Liu.JavaWork.SecondWeek;

public class Student {
	public String name;
	public int age;
	public int education;
	public Student(String name, int age, int education) {
		this.name = name;
		this.age = age;
		this.education = education;
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
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	
	public void Show(){
		System.out.println(getAge()+"\r\n"+getName()+"\r\n"+getEducation());
	}
}
