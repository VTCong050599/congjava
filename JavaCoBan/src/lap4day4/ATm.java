package lap4day4;

public interface ATm{
	boolean withdraw(int sotk,double sotienrut);
	boolean deposit(int sotkgui,double sotiengui);
	double queryBalance(int so);
	boolean login(String sotk,String password);
	boolean logout(String sotk);
}
