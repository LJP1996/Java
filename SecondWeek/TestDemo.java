package com.Liu.JavaWork.SecondWeek;

public class TestDemo {
	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("������", 18, 11, "�������");
		EducationStu educationStu = new EducationStu("����", 19, 12, "�˹�����");
		System.out.println("������:");
		undergraduate.Show();
		System.out.println();
		System.out.println("�о���:");
		educationStu.Show();
	}
}
