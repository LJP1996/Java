package com.Liu.JavaWork.ThirdWeek;
/*
 * ���ڽӿڵĶ���
 * 
 * ���������ӿ�ѧ������ͽ�ʦ����
 * ����һ������Graduate���ٶ����䷽��
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
		System.out.println("��������������:");
		int a =scanner.nextInt();
		System.out.println("��������ѧ��:");
		int b =scanner.nextInt();
		graduate.setFee(b);
		graduate.setPay(a);
		if ((graduate.getPay()-graduate.getFee())<2000) {
			System.out.println("provide a loan");
		}
	}
}
