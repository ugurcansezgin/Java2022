public class recapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = { 1.2, 1.3, 1.4, 5.6};
		double total = 0;
		double max = myList[0];
		
		//Bütün sayıları tek tek yazdırma işlemi
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		//Sayıların toplamını yazdırma işlemi
		System.out.println("Toplam : "+total);
		//En büyük sayıyı yazdırma
		System.out.println("En Büyük : "+max);
		

	}

}
