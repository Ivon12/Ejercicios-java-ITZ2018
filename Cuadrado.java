package modelo;

import java.util.Scanner;

public class Cuadrado {
	public static float lado;
	
	public static void calcularArea(float lado){
		if (lado>0) {
			float area=lado*lado;
			System.out.println("El área del cuadrado con el dato "+lado+" es: \n "+area);
		}else{
			System.out.println("Ingresa la medida del lado");
		}
	}
	public static void calcularPerimetro(float lado){
		if (lado>0) {
			float perimetro=lado*4;
			System.out.println("El perimetro del cuadrado con el dato "+lado+" es: \n "+perimetro);
		}else{
			System.out.println("Ingresa la medida del lado");
		}
	}
}
