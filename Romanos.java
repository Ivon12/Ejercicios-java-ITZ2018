package modelo;

import java.util.Scanner;

public class Romanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		int num=0;
		System.out.println("Ingresa un número");
		Scanner sn=new Scanner(System.in);
		num=sn.nextInt();
		if(num<=1000 & num>0){
			if(num==1000){
				res+="M";
				num=0;
			}else{
				if(num>=900){
					res+="CM";
					num=num-900;
				}
				if(num>=500 & num>0){
					res+="D";
					num=num-500;
				}else if(num>=400){
					res+="CD";
					num=num-400;
				}
				for (int j = 0; j < 3; j++) {
					if(num>=100 & num>0){
						res+="C";
						num=num-100;
					}
				}
				if(num>=90){
					res+="XC";
					num=num-90;
				}
				if(num>=50 & num>0){
					res+="L";
					num=num-50;
				}else if(num>=40){
					res+="XL";
					num=num-40;
				}
				for (int j = 0; j < 3; j++) {
					if(num>=10 & num>0){
						res+="X";
						num=num-10;
					}
				}
				if(num==9 & num>0){
					res+="IX";
					num=num-9;
				}else if (num>=5 & num>0) {
					res+="V";
					num=num-5;
				}
				if(num==4 & num>0){
					res+="IV";
					num=num-4;
				}
				for (int j = 0; j < 3; j++) {
					if(num>=1 & num>0){
						res+="I";
						num=num-1;
					}
				}
			}
		}else{
			System.out.println("ingrese un número en el rango de 1 a 1000");
		}
		System.out.println("resultado "+res);
		
	}

}
