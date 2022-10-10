package estructuraControl2;

public class estructura5 {
	public static void main (String[]args) {
		
		int edad = 5;
		String situacionLegal;
		
		if (edad<18) {
			situacionLegal ="Menor de edad";
		}else {
			situacionLegal = "Mayor de edad";
		}
		System.out.println("La persona es: " + situacionLegal);
	}

}
