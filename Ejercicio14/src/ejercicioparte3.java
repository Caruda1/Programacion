
public class ejercicioparte3 {
	public static void main (String[]args) {
		float radio = 2f;
		float gradosRadiales = 10f;
		
		//La formula es Área = (R2 * β ) / 2
		
		float area = ((radio * radio) * gradosRadiales) / 2;
		System.out.println("Elarea del circulo con radio" +radio+ "y con" +gradosRadiales+ "expresado en radianes es" + area);
		
	}

}
