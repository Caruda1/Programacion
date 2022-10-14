package estructurasdecontrol2;

public class Ejercicio10 {
	public static void main (String[]args) {
		float mates = 5f;
		float fisica = 4f;
		float quimica = 7f;
		
		if (mates>=6.5 && fisica>=6 && quimica>=5) {
			System.out.println("Puede estudiar A");
		}else if (mates<=6.5 && fisica<=6 && quimica<=5) {
			System.out.println("No puede estudiar");
		}else {
			System.out.println("Puede estudiar por media 7");
		}
	}

}
