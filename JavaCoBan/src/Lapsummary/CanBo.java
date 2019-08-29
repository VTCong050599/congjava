package Lapsummary;

import java.util.Collection;

public abstract class CanBo {
	String hoten;
	String namsinh;
	String gioitinh;
	String diachi;
	
	public CanBo() {
		super();
	}
	

	public CanBo(String hoten) {
		super();
		this.hoten = hoten;
	}


	public CanBo(String hoten, String namsinh, String gioitinh, String diachi) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}



	public String getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
}
