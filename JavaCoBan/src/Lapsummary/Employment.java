package Lapsummary;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employment extends CanBo {
	private String work;

	public Employment(String work) {
		super();
		this.work = work;
	}
	
	public Employment() {
		super();
	}

	public Employment(String hoten,String namsinh,String gioitinh,String diachi, String work) {
		super();
		this.work = work;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	static List<Employment> employment1;
	public void informationEmploy() {
		System.out.println(" input so luong employment");
		Scanner infor = new Scanner(System.in);
		int n = infor.nextInt();
		employment1 = new ArrayList<Employment>();
		for (int i=0; i<n ; i++) {
			System.out.println(" hoten");
			String hoten1 = infor.next();
			System.out.println(" namsinh");
			String namsinh1 = infor.next();
			System.out.println(" gioitinh");
			String gioitinh1 = infor.next();
			System.out.println(" diachi");
			String diachi1 = infor.next();
			System.out.println(" work");
			String work = infor.next();
			Employment engineerer = new Employment(hoten1, namsinh1, gioitinh1, diachi1, work);
			employment1.add(engineerer);
		}
		
	}
	public static void outprintEm() {
		if( employment1 == null) {
			System.out.println(" list null");
		}
		else {
		for( Employment outinformation: employment1) {
			System.out.println(outinformation.getHoten());
			System.out.println(outinformation.getNamsinh());
			System.out.println(outinformation.getGioitinh());
			System.out.println(outinformation.getDiachi());
			System.out.println(outinformation.getWork());
				}
		}
	}
	public static void findEm() {
		System.out.println(" nhap ten employment can timkiem");
		Scanner inputw = new Scanner(System.in);
		String nameemployment = inputw.next();
//		Worker worker = new Worker(nameworker);
		for( Employment finder : employment1) {
			boolean check =nameemployment.contains(finder.getHoten());
			if(check == true) {
				System.out.println(" Have Data");
		}
			else System.out.println(" False");
		}
	}
	
	
}
