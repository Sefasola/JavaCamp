
public class ArraysDemo2 {

	public static void main(String[] args) {
		String öğrenci1 = "Engin";
		String öğrenci2 = "Derin";
		String öğrenci3 = "Salih";
		String öğrenci4 = "Ahmet";
		
		String[] öğrenciler = new String[4];
		
		öğrenciler[0] = öğrenci1;
		öğrenciler[1] = öğrenci2;
		öğrenciler[2] = öğrenci3;
		öğrenciler[3] = öğrenci4;
		for(int i=0; i<öğrenciler.length; i++) {
			System.out.println(öğrenciler[i]);
		}
		
		for(String ögr: öğrenciler) {
			System.out.println(ögr);
		}
		


	}

}
