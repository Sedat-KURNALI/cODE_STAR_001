package otherSample001;
	// * @techpro Stundent
public class Q01_4 {
	
	// Soru 4 ) double 255.36 sayısını int’a ve sonra da oluşturduğunuz int sayıyı byte'a çevirip yazdırın
		
	public static void main(String[] args) {
		
		double do1 = 96.15;
		int in1 = (int) do1;
		byte by1 = (byte) in1;
		
		System.out.println("double veri = " + do1);
		System.out.println("integer veri = " + in1);
		System.out.println("byte veri = " + by1);
				
	}
}