package com.Liu.JavaWork.FirstWeek;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您需要计算的数:");
		int num = scanner.nextInt();
		Second second = new Second();
		second.Counts(num,num);
	}

	private int Counts(int n, int m) {
		// TODO Auto-generated method stub
		System.out.println(n);
		if (n>5000) {
			return Cmds(n/2,m);
		}
		else
			return Counts(n*2, m);
	}

	private int Cmds(int n, int m) {
		// TODO Auto-generated method stub
		System.out.println(n);
		if (n/2>0) {
			if (n==m) {
				return 0;
			}
			return Cmds(n/2, m);
		}
		return 0;
	}
}
