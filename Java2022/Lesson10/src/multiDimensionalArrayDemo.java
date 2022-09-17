public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Amasya";
		sehirler[0][1] = "Samsun";
		sehirler[0][2] = "Çorum";
		sehirler[1][0] = "İstanbul";
		sehirler[1][1] = "Kırklareli";
		sehirler[1][2] = "Edirne";
		sehirler[2][0] = "Hatay";
        sehirler[2][1] = "Mersin";
		sehirler[2][2] = "Antalya";		

		
		for(int i = 0; i<=2; i++) {
			System.out.println("------------------------------------");
			for(int j = 0; j<=2; j++ ) {
				System.out.println(sehirler[i][j]);
			}
		}


	}

}
