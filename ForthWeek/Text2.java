package com.Liu.JavaWork.ForthWeek;
/*
 * 通过输入您需要的时间字符串
 * 转化为日期
 * 如错误 将会抛出异常
 * 
 * */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Text2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您需要的日期(格式为:xxxx/xx/xx)：");
		String string = scanner.next();
		char[] cs =string.toCharArray();
		try {
			if (cs[4]=='/'&&cs[7]=='/'&&cs.length==10){
			    Date d = new SimpleDateFormat("yyyy/MM/dd").parse(string);
			    System.out.println(d);
			}else {
				throw new MyException1();
			}
		} catch (MyException1 e) {
			// TODO: handle exception
			e.Errorgeshi();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyException1 extends Exception{
	public void Errorgeshi(){
		System.out.println("格式错误");
	}
}