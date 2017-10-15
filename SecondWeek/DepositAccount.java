package com.Liu.JavaWork.SecondWeek;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DepositAccount {
	static double tax = 0.023;
	private int account;
	private String accountname;
	private double balance ;
	private double money;
	public void  OpenAccount() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入注册信息");
		System.out.println("请输入你的账户：");
		account = scanner.nextInt();
		File d = new File(account+".txt");
        d.createNewFile();
		balance = 5000;
		System.out.println("请输入你的账户姓名：");
		accountname = scanner.next();
		FileWriter fr = new FileWriter(account+".txt",true);
		fr.write("账户是:"+account+"\r\n");
		fr.write("账户姓名是:"+accountname+"\r\n");
		fr.write("账户定存是:"+balance+"\r\n");
		System.out.println("开户完成");
		fr.close();
	}
	public void  ExisMoney() throws IOException {
		System.out.println("请输入你存款钱数:");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextDouble();
		balance += money;
		FileWriter fw = new FileWriter(account+".txt",true);
		fw.write("余额为:"+balance+"\r\n");
		fw.close();
		System.out.println("存款完成");
	}
	public void  Check() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你想查询的账户号：");
		int newaccount = scanner.nextInt();
		System.out.println("账户信息");
		FileReader fReader  = new FileReader(newaccount+".txt");
		char[] cb = new char[32];
		int hasRead = 0;
		while((hasRead=fReader.read(cb))>0){
			System.out.print(new String(cb,0,hasRead));
		}
	}
	public Double TaxCal() throws IOException {
		Double YearTax;
		YearTax = balance*tax;
		FileWriter fw = new FileWriter(account+".txt",true);
		fw.write("年利息:"+YearTax+"\r\n");
		fw.close();
		return YearTax;
	}
}
