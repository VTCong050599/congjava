package Lapsummary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
	static Worker worker = new Worker();
	static Engineerer engineerer = new Engineerer();
	static Employment employment = new Employment();
	public static void main(String arg[]) {
		int choose=0;
		do {
		System.out.println("===========MeNu============");
		System.out.println(" 1. Input List ");
		System.out.println(" 2. Output List");
		System.out.println(" 3. Finder List");
		System.out.println(" 4. Exist List");
		Scanner inlist = new Scanner(System.in);
		choose = inlist.nextInt();
		switch(choose) {
			case 1:
				Inputlist();
				break;
			case 2:
				Outputlist();
				break;
			case 3:
				Finderlist();
				break;
			}
		}while (choose != 4);
	}
	public static void Inputlist() {
		int inlist=0;
		while(inlist != 4) {
		System.out.println("1. Input list Worker");
		System.out.println("2.Input list Engineerer");
		System.out.println("3. Input list Employment");
		System.out.println("4. Exist");
		System.out.println("=======Choose==========");
		Scanner input = new Scanner(System.in);
		inlist = input.nextInt();
			switch(inlist) {
			case 1 :
				worker.information();
				break;
			case 2:
				engineerer.informationE();
				break;
			case 3:
				employment.informationEmploy();
				break;
			}
		}
	}
	public static void Outputlist() {
		int outlist = 0;
		do {
			System.out.println("1.	Output list Worker");
			System.out.println("2.	Output list Engineerer");
			System.out.println("3. 	Output list Employment");
			System.out.println("4. 	Exist");
			System.out.println("=======Choose==========");
			Scanner input = new Scanner(System.in);
			outlist = input.nextInt();
				switch(outlist) {
				case 1 :
					worker.outprint();
					break;
				case 2:
					engineerer.outprintE();
					break;
				case 3:
					employment.outprintEm();
					break;
				}
			} while(outlist !=4);
	}
	public static void Finderlist() {
		int find=0;
		do {
		System.out.println("1. 	Finder information worker");
		System.out.println("2.	Finder information engineerer");
		System.out.println("3. 	Finder information employment");
		System.out.println("0. 	Out");
		System.out.println(" who are you want to find information ");
		System.out.println(" you choose ???");
		Scanner input = new Scanner(System.in);
		find = input.nextInt();
		if(find == 1) {
			worker.find();
		}
		if(find == 2) {
			engineerer.findE();
		}
		if(find == 3 ) {
			employment.findEm();
		}
		
		}while(find != 0);
	}
}
