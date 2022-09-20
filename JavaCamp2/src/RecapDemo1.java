
public class RecapDemo1 {

	public static void main(String[] args) {
		int sayı1 = 266;
		int sayı2 = 25;
		int sayı3 = 26;
		int enbuyuksayı = sayı1;
		
		if (enbuyuksayı<sayı2) {
			enbuyuksayı = sayı2;
		}
		if(enbuyuksayı<sayı3) {
			enbuyuksayı = sayı3;
		}
		
		System.out.println("En büyük = " + enbuyuksayı);

	}

}
