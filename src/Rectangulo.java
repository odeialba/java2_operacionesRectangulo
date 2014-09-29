import java.util.Scanner;

public class Rectangulo {

	public static void main(String args[]) {


		double base, altura, result;
		OperacionesRectangulo operaciones = new OperacionesRectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce la altura de un rectangulo: ");
		altura = sc.nextInt();
		operaciones.setAltura(altura);


		System.out.print("\nIntroduce la base de un rectangulo: ");
		base = sc.nextInt();
		operaciones.setBase(base);

		
		
		result = operaciones.area();
		System.out.println("\nEl area del rectangulo es: " + result);
		result = operaciones.perimetro();
		System.out.println("\nEl perimetro del rectangulo es: " + result);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
