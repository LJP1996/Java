package com.Liu.JavaWork.SecondWeek;

public class EducationStu extends Student{
	private String direction;
	public EducationStu(String name, int age, int education,String direction) {
		super(name, age, education);
		// TODO Auto-generated constructor stub
		this.direction = direction;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void Show(){
		System.out.println("名字:"+getName()+"\r\n"+"年龄:"+getAge()+"\r\n"
	+"学历:"+getEducation()+"\r\n"+"研究方向:"+getDirection());
	}
}
