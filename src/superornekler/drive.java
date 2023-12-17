package superornekler;

public class drive {
	public static void main(String[] args) {
		
		Kisi kisi=new Kisi("rahime");
	
		ogrenci ogrenci =new ogrenci("rahime",10);
		kisi.setİsim("ahmet");
		ogrenci.setNumara(25);
		
		System.out.println(ogrenci.getİsim());
		System.out.println(kisi.getİsim());
		System.out.println(ogrenci.getNum());
	
	
		
	}

}
