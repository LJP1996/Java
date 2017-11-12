package com.Liu.JavaWork.ThirdWeek2;
/*
 * 
 * 一个基类接口，
 * 定义三个类并继承此接口
 * 主类之中定义艺术组切分别new三个不同的对象
 * */
public class Car {
	public static void main(String[] args) {
		CompanyWeight[] companyWeights = new CompanyWeight[3];
		companyWeights[0] = new Television();
		companyWeights[1] = new Computer();
		companyWeights[2] = new WashMachine();
		
		System.out.println(companyWeights[0].companyweight());
		System.out.println(companyWeights[1].companyweight());
		System.out.println(companyWeights[2].companyweight());
		
	}
}
