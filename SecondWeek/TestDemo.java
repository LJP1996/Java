package com.Liu.JavaWork.SecondWeek;

public class TestDemo {
	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("刘嘉鹏", 18, 11, "软件工程");
		EducationStu educationStu = new EducationStu("李四", 19, 12, "人工智能");
		System.out.println("本科生:");
		undergraduate.Show();
		System.out.println();
		System.out.println("研究生:");
		educationStu.Show();
	}
}
