package com.Liu.JavaWork.ThirdWeek;
/*
 * 对于接口的定义
 * 
 * 定义两个接口学生管理和教师管理；
 * 定义一个主类Graduate，再定义其方法
 * */
import java.util.Scanner;

public class Graduate implements StudentManagerInterface,TeacherManagerInteface{
	public String name;
	public int sex;
	public int age;
	public int fee;
	public int pay;
	@Override
	public int setPay(int a) {
		// TODO Auto-generated method stub
		pay=a;
		return pay;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
	@Override
	public int setFee(int a) {
		// TODO Auto-generated method stub
		fee = a;
		return fee;
	}
	@Override
	public int getFee() {
		// TODO Auto-generated method stub
		return fee;
	}
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的收入:");
		int a =scanner.nextInt();
		System.out.println("请输入您学费:");
		int b =scanner.nextInt();
		graduate.setFee(b);
		graduate.setPay(a);
		if ((graduate.getPay()-graduate.getFee())<2000) {
			System.out.println("provide a loan");
		}
	}
}
