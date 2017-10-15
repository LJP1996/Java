package com.Liu.JavaWork.SecondWeek;

public class Undergraduate extends Student{
	private String speciaty;
	
	public String getSpeciaty() {
		return speciaty;
	}

	public void setSpeciaty(String speciaty) {
		this.speciaty = speciaty;
	}

	public Undergraduate(String name, int age, int education,String speciaty) {
		super(name, age, education);
		// TODO Auto-generated constructor stub
		this.speciaty = speciaty;
	}
	public void Show(){
		System.out.println("名字:"+getName()+"\r\n"+"年龄:"+getAge()
		+"\r\n"+"学历:"+getEducation()+"\r\n"+"专业:"+getSpeciaty());
	}
}