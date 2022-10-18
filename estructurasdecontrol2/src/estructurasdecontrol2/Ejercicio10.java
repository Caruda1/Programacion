package estructurasdecontrol2;

public class Ejercicio10 {
	public static void main (String[]args) {
		float mates = 5f;
		float fisica = 4f;
		float quimica = 7f;
		
		if ((mates>=6.5 && fisica>=6 && quimica>=5) || (mates+ fisica + quimica)/3 >=7) {
			System.out.println("Puede estudiar A");
		}else {
			System.out.println("No puede estudiar");
		}
	}

}
