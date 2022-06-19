package ejercicio_3;

public class ejercicio_3 {
	public static void main(String[] args) {
		String nombres1[]= {"Arturo","Juan","Luisa","Esto es un texto"};
		bucle ciclo=new bucle(nombres1);
		
	}
}
class bucle{
	String[] entrada;
	bucle(String[] nombres){
		this.entrada=nombres;
		for(int i=0;i<nombres.length;i++) {
			System.out.print(nombres[i]);
			for(int j=0;j<nombres.length;j++) {
				System.out.print(" ");
			}
			
		}
			
	}
}
