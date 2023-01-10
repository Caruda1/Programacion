
public class Array {
	public static void main(String[]args) {
		
	
	int nums [] = {8, 2, 5, 3, 53};
	
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
	int [][] tabla = {
			{63, 73, 53, 52, 55, 32, 32},
			{34, 62, 63, 72, 28, 92}
		};
		
		for(int i=0; i < tabla.length; i++) {
			for(int j=0; j< tabla[i].length; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
	}
	String[] musicos= {"Evaristo Paramos" , "Iosu Escecddc" , "Johnny rotten" , " lou Reed"};
	
	for (String x : musicos) {
		
		System.out.println(x);
	}
}
}
			