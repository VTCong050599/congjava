package lap4day4;

import java.util.Scanner;

public class MainATmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" nhập số tkht, mkhientai");
		Scanner login1 = new Scanner(System.in);
		int tk = login1.nextInt();
		int pss = login1.nextInt();
		ATMImpl logining = new ATMImpl(tk,pss);
		System.out.println(" Số tiền hiện có");
		Scanner input1 = new Scanner(System.in);
		double money = input1.nextDouble();
		logining.setSotienhientai(money);
		System.out.println(" nhap số tiền rút");
		Scanner input3 = new Scanner(System.in);
		double sotienrut = input3.nextDouble();
		logining.withdraw(tk, sotienrut);
		System.out.println(" nhap số tiền gửi, tài khoản gửi ");
		Scanner input2 = new Scanner(System.in);
		int tkgui = input2.nextInt();
		double sotiengui = input2.nextDouble();
		logining.deposit(tkgui, sotiengui);
		
	}
}
