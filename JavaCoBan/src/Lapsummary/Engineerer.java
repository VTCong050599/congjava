package Lapsummary;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engineerer extends CanBo {
	private String nganhdaotao;
	
	public Engineerer(String nganhdaotao) {
		super();
		this.nganhdaotao = nganhdaotao;
	}
	
	

	public Engineerer(String hoten,String namsinh,String gioitinh,String diachi, String nganhdaotao) {
		super();
		this.nganhdaotao = nganhdaotao;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public Engineerer() {
		// TODO Auto-generated constructor stub
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	static List<Engineerer> engineerer1;
	public void informationE() {
		System.out.println(" input so luong engineerer");
		Scanner infor = new Scanner(System.in);
		int n = infor.nextInt();
		engineerer1 = new ArrayList<Engineerer>();
		for (int i=0; i<n ; i++) {
			System.out.println(" hoten");
			String hoten1 = infor.next();
			System.out.println(" namsinh");
			String namsinh1 = infor.next();
			System.out.println(" gioitinh");
			String gioitinh1 = infor.next();
			System.out.println(" diachi");
			String diachi1 = infor.next();
			System.out.println(" nganhdaotao");
			String nganh = infor.next();
			Engineerer engineerer = new Engineerer(hoten1, namsinh1, gioitinh1, diachi1, nganh);
			engineerer1.add(engineerer);
		}
		
	}
	public static void outprintE() {
		if(engineerer1 == null) {
			System.out.println(" list null");
		}
		else {
		for( Engineerer outinformation: engineerer1) {
			System.out.println(outinformation.getHoten());
			System.out.println(outinformation.getNamsinh());
			System.out.println(outinformation.getGioitinh());
			System.out.println(outinformation.getDiachi());
			System.out.println(outinformation.getNganhdaotao());
			}
		}
	}
	public static void findE() {
		System.out.println(" nhap ten engineerer can timkiem");
		Scanner inputw = new Scanner(System.in);
		String nameengineerer = inputw.next();
//		Worker worker = new Worker(nameworker);
		for( Engineerer finder : engineerer1) {
			boolean check =nameengineerer.contains(finder.getHoten());
			if(check == true) {
				System.out.println("Have Data");
		}
			else System.out.println(" False");
		}
	}
	
	}
