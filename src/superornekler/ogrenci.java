package superornekler;

public class ogrenci extends Kisi{
	
	private int numara;
	
	public ogrenci(String isiim,int numara_) {
		super(isiim);
		numara=numara_;
	}
	public int getNum() {
		return numara;
	}
	public void setNumara(int num) {
		numara=num;
	}}
