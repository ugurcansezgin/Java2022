public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.    ";
		System.out.println(mesaj);
		
	/*  System.out.println("Eleman sayısı = " +mesaj.length());
	    System.out.println("5. eleman : " +mesaj.charAt(4)); //4. elemanı yazdırır.
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B")); //Mesaj B ile mi başlıyor sorusunu cevaplar.
		System.out.println(mesaj.endsWith(".")); //Mesaj . ile mi bitiyor sorusunu cevaplar.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //istenilen karakterin kaçıncı eleman olduğunu gösterir.
		System.out.println(mesaj.lastIndexOf('e')); //aramaya sağdan başlayarak arama yapar. */
	
	
	 String yeniMesaj = mesaj.replace(' ','-');
	 System.out.println(yeniMesaj);
	 System.out.println(mesaj.substring(2,5)); // istenilen indexten itibaren kes.(2. indexten 5.indexe kadar.)
	 
	 //bütün kelimeleri alt alta yazdırma işlemi
	 for(String kelime : mesaj.split(" ")) {
		 System.out.println(kelime);
	 }
	 
	 System.out.println(mesaj.toLowerCase()); //bütün harfleri küçük harfe çevirme işlemi
	 System.out.println(mesaj.toUpperCase()); //bütün harfleri büyük harfe çevirme işlemi
	 System.out.println(mesaj.trim()); //boşlukları silme işlemi
	}

}
