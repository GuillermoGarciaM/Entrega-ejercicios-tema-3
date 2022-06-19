package Ejercicio_Dos;
import java.util.*;

public class Ejercicio_2 {
	
	public static void main(String[] args){
		
		metodo calculo=new metodo();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa el precio");
		int precio = entrada.nextInt();
		System.out.println("El precio con iva es: " + calculo.metodo(precio));
		
		
		
	}
	
}
	class metodo{
	double precio;
	double metodo(double precio){
		this.precio=precio;
		return precio*1.16;
	}
}