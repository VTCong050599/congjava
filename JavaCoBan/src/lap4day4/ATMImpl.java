package lap4day4;

public class ATMImpl implements ATm{
	private int sotkhientai;
	private int matkhauhientai;
	private double sotienhientai;
	
	
	public ATMImpl(int sotkhientai, int matkhauhientai) {
		super();
		this.sotkhientai = sotkhientai;
		this.matkhauhientai = matkhauhientai;
	}


	public ATMImpl( double sotienhientai) {
		super();
		this.sotienhientai = sotienhientai;
	}


	public ATMImpl() {
		// TODO Auto-generated constructor stub
	}


	public int getIdATM() {
		return matkhauhientai;
	}

	public void setIdATM(int idATM) {
		this.matkhauhientai = idATM;
	}

	public double getSotienhientai() {
		return sotienhientai;
	}

	public void setSotienhientai(double sotienhientai) {
		this.sotienhientai = sotienhientai;
	}

	public int getAccountId() {
		return sotkhientai;
	}

	public void setAccountId(int accountId) {
		this.sotkhientai = accountId;
	}

	@Override
	public boolean withdraw(int sotk, double sotienrut) {
		// TODO Auto-generated method stub
		if (this.sotienhientai >= sotienrut && this.sotienhientai >=50000) {
			this.sotienhientai -= sotienrut;
			System.out.println("Số tiền bạn rút : "+ sotienrut);
			System.out.println(" Số tiền còn lại :"+ this.sotienhientai);
			return true;
			}
		else
			System.out.println(" Số tiền hiện tại của bạn không đủ để rút");
			return false;
	}
	@Override
	public boolean deposit(int sotkgui, double sotiengui) {
		// TODO Auto-generated method stub
		if(this.sotienhientai>sotiengui) {
		this.sotienhientai = this.sotienhientai-sotiengui;
		System.out.println(" số tiền đã gửi đi "+sotiengui);
		}
		else 
			System.out.println(" số tiền hiện có ko đủ để gửi");
			return false;
		
	}
	@Override
	public double queryBalance(int so) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	@Override
	public boolean login(String taikhoan, String password) {
		this.sotkhientai = Integer.parseInt(taikhoan);
		return false;
	}
	@Override
	public boolean logout(String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}