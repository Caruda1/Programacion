
public class Principal {
	
	public static void main (String args[]) {
		
		Administrativo a = new Administrativo("121558-P", "Pepe", 222.0, 22.0);
		Programador p = new Programador ("72724-P", "kike", 230.0, 20.0);
		Comercial c = new Comercial("8882829-P", "Juan", 555.0, 200.0, 20.0);
		
		
		System.out.println("El sueldo del empleado: "+a.getNombre()+ "con DNI: "+a.getDni()+"es de: "+a.calculaSalario());
		System.out.println("El sueldo del empleado: "+p.getNombre()+ "con DNI: "+p.getDni()+"es de: "+p.calculaSalario());
		System.out.println("El sueldo del empleado: "+c.getNombre()+ "con DNI: "+c.getDni()+"es de: "+c.calculaSalario());
	}
}
