
public class SayıBulma {

	public static void main(String[] args) {
		int[] sayılar = new int[] {1,2,5,7,9};
	     int aranacak=5;
	     boolean varmı = false;
	     
	     for(int sayı: sayılar) {
	    	 varmı = true;
	    	 break;
	     }
	     
	     if(varmı) {
	    	 System.out.println("sayı mevcuttur");
	     }
	     else {
			System.out.println("sayı mevcut değildir");
		}


	}

}
