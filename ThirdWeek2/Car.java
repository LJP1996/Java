package com.Liu.JavaWork.ThirdWeek2;
/*
 * 
 * һ������ӿڣ�
 * ���������ಢ�̳д˽ӿ�
 * ����֮�ж����������зֱ�new������ͬ�Ķ���
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
