
public class StringsDemo {

	public static void main(String[] args) {
		String mesajString = "Bugün hava çok güzel";
		System.out.println(mesajString);
		
		System.out.println("eleman sayısı: " + mesajString.length());
        
		System.out.println("5. eleman: "+ mesajString.charAt(4) );
		
		System.out.println(mesajString.concat(" yaşasın"));
		
		System.out.println(mesajString);
		
		System.out.println(mesajString.startsWith("B"));
		System.out.println(mesajString.endsWith("l"));
	
	
	   char[] karakterler = new char[5];
	   mesajString.getChars(0, 5, karakterler, 0);
	   System.out.println(karakterler);
	   System.out.println(mesajString.indexOf('a'));
	   
	   System.out.println(mesajString.replace(" ", "-"));
	   System.out.println(mesajString.substring(2, 5));
	   
	   for(String kelime: mesajString.split(" ")) {
		   System.out.println(kelime);
	   }
	   
	   System.out.println(mesajString.toLowerCase());
	   System.out.println(mesajString.toUpperCase());
	   System.out.println(mesajString.trim());

	}

}
