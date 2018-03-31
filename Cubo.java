package modelo;

import java.util.Scanner;

public class Cubo extends Cuadrado{
	//calcular volumen y perimetro
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir=false;
		while (!salir) {
			System.out.println("Elige una opción");
			System.out.println("1. Ingresa el lado");
			System.out.println("2. Calcular el área del cuadrado");
			System.out.println("3. Calcular el perimetro del cuadrado");
			System.out.println("4. Calcular volumen del cubo");
			System.out.println("5. Calcular el perimetro del cubo");
			System.out.println("6. Salir");
			System.out.println("7. Cancelar");
			
			Scanner sn=new Scanner(System.in);
			int opcion=sn.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingresa la medida del lado");
				Scanner entradaLado=new Scanner(System.in);
				lado=entradaLado.nextInt();
				break;
			case 2:
				calcularArea(lado);
				break;
			case 3:
				calcularPerimetro(lado);
				break;
			case 4:
				calcularVolumen(lado);
				break;
			case 5:
				perimetroCubo(lado);
				break;
			case 6:
				System.out.println("Saliste");
				salir=true;
				break;
			case 7:
				System.out.println("Cancelaste el dato");
				System.out.println("Ingresa el lado");
				entradaLado=new Scanner(System.in);
				lado=entradaLado.nextInt();
				break;
			default:
				break;
			}
		}
	}
	public static void calcularVolumen(float lado){
		if (lado>0) {
			float volumen=lado*lado*lado;
			System.out.println("El volumen del cubo con el dato "+lado+" es: \n "+volumen);
		}else{
			System.out.println("Ingresa la medida del lado");
		}
	}
	public static void perimetroCubo(float lado){
		if (lado>0) {
			float p=lado*12;
			System.out.println("El perimetro del cubo con el dato "+lado+" es: \n "+p);
		}else{
			System.out.println("Ingresa la medida del lado");
		}
	}
}
