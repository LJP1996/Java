package com.Liu.JavaWork.SecondWeek;

import java.io.IOException;

public class DepositAccountDemo {
	public static void main(String[] args) {
		DepositAccount depositAccount = new DepositAccount();
		try {
			depositAccount.OpenAccount();
			depositAccount.ExisMoney();
			depositAccount.TaxCal();
			depositAccount.Check();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
