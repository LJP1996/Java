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
		System.out.println("������ע����Ϣ");
		System.out.println("����������˻���");
		account = scanner.nextInt();
		File d = new File(account+".txt");
        d.createNewFile();
		balance = 5000;
		System.out.println("����������˻�������");
		accountname = scanner.next();
		FileWriter fr = new FileWriter(account+".txt",true);
		fr.write("�˻���:"+account+"\r\n");
		fr.write("�˻�������:"+accountname+"\r\n");
		fr.write("�˻�������:"+balance+"\r\n");
		System.out.println("�������");
		fr.close();
	}
	public void  ExisMoney() throws IOException {
		System.out.println("����������Ǯ��:");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextDouble();
		balance += money;
		FileWriter fw = new FileWriter(account+".txt",true);
		fw.write("���Ϊ:"+balance+"\r\n");
		fw.close();
		System.out.println("������");
	}
	public void  Check() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������ѯ���˻��ţ�");
		int newaccount = scanner.nextInt();
		System.out.println("�˻���Ϣ");
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
		fw.write("����Ϣ:"+YearTax+"\r\n");
		fw.close();
		return YearTax;
	}
}
