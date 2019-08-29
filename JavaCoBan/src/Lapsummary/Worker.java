package Lapsummary;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worker extends CanBo {
	private String bacworker;


	public Worker(String hoten,String namsinh,String gioitinh,String diachi, String bacworker) {
		super();
		this.bacworker = bacworker;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public Worker() {
		// TODO Auto-generated constructor stub
	}
	public Worker(String hoten) {
		super();
		this.hoten = hoten;
	}
	

	public String getBacworker() {
		return bacworker;
	}

	public void setBacworker(String bacworker) {
		this.bacworker = bacworker;
	}
	static List<Worker> worker1 ;
	public static void information() {
		System.out.println(" input so luong worker");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		worker1 = new ArrayList<Worker>();	
		for (int i=0; i<n ; i++) {
			System.out.println(" hoten");
			String hoten1 = input.next();
			System.out.println(" namsinh");
			String namsinh1 = input.next();
			System.out.println(" gioitinh");
			String gioitinh1 = input.next();
			System.out.println(" diachi");
			String diachi1 = input.next();
			System.out.println(" bacworker");
			String bac = input.next();
			Worker worker = new Worker(hoten1, namsinh1, gioitinh1, diachi1, bac);
			worker1.add(worker);
		}
	}
//	public static void checklist() {
//		if (worker1 == null ) {
//			System.out.println(" List full");
//		}
	
	public  void outprint() {
		if(worker1 == null) {
			System.out.println(" list null");
		}
		else {
		for( Worker outinformation: worker1) {
			System.out.println(outinformation.getHoten());
			System.out.println(outinformation.getNamsinh());
			System.out.println(outinformation.getGioitinh());
			System.out.println(outinformation.getDiachi());
			System.out.println(outinformation.getBacworker());
			}
		}
	}
	public static void checklist() {
		for (Worker checklist : worker1) {
			if(checklist == null) {
				System.out.println(" List null");
			}
		}
	
	}
	public static void find() {
		System.out.println(" nhap ten worker can timkiem");
		Scanner inputw = new Scanner(System.in);
		String nameworker = inputw.next();
//		Worker worker = new Worker(nameworker);
		for( Worker finder : worker1) {
			boolean check =nameworker.contains(finder.getHoten());
			if(check == true) {
				System.out.println(" Have Data");
		}
			else System.out.println(" False");
		}
	}
	
}

