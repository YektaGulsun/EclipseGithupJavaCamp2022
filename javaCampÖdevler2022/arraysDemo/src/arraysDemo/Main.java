package arraysDemo;

public class Main {
	
	public static void main(String[] args) {
		String ogrenci1 = "Yekta";
		String ogrenci2 = "Gökta";
		String ogrenci3 = "Dilan";
		String ogrenci4 = "Berivan";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println(".........");
		
		
		String[] ogrenciler = new String[4] ;
		ogrenciler[0]="Yekta";
		ogrenciler[1]="Gökta";
		ogrenciler[2]="Dilan";
		ogrenciler[3]="Berivan";
		
		for(int i=0 ; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]) ;
			
		}
		    System.out.println("..........") ;
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci) ;
			
			
		}
		
		
	}
	

}
