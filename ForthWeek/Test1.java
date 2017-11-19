package com.Liu.JavaWork.ForthWeek;
/*
 * 
 * 对于十六进制的计算
 * 先判断其格式是否对，然后进行计算
 * */

import java.util.Scanner;

public class Test1 {
	public static int zhuan(char c) {//对于每个字符所对应的数值
		int zx = 0;
		switch (c) {
		case '1':
			zx = 1;
			break;
		case '2':
			zx = 2;
			break;
		case '3':
			zx = 3;
			break;
		case '4':
			zx = 4;
			break;
		case '5':
			zx = 5;
			break;
		case '6':
			zx = 6;
			break;
		case '7':
			zx = 7;
			break;
		case '8':
			zx = 8;
			break;
		case '9':
			zx = 9;
			break;
		case 'A':
			zx = 10;
			break;
		case 'B':
			zx = 11;
			break;
		case 'C':
			zx = 12;
			break;
		case 'D':
			zx = 13;
			break;
		case 'E':
			zx = 14;
			break;
		case 'F':
			zx = 15;
			break;
		default:
			break;
		}
		return zx;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入16进制的数字(类似于 0x12C,)：");
		String st = scanner.next();
		char[] ch = st.toCharArray();//转化为字符数组
		try {
			if (ch[0]!='0'&&ch[1]!='x') {//对其格式的判断
				throw new MyException();//抛出异常
			}else {
				int b=ch.length-2;
				int a=b;
				int i=2;
				int sum=0;
				boolean flag=true;
				while(flag){
					int n=zhuan(ch[i]);
					sum+=n*Math.pow(16, b-1);
					if (i-1==a) {//将其所要计算的数组长度与字符长度做比较，判断
						flag=false;
					}
					i++;
					b--;
				}
				System.out.println("十进制答案是:"+sum);
			}
		} catch (MyException e) {
			// TODO: handle exception
			e.Errorshuru();
		}
	}
}
class MyException extends Exception{
	public void Errorshuru(){
		System.out.println("输入错误");
	}
}
