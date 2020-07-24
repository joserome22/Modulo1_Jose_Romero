package ar.com.golballogic.bootcamp.ejercicioindividual.controldeflujo;

public class Ejercicio45 {
	
	public static void main(String[] args) {
		 int suma=0;
		 for(int i=0;i<=10000;i++) {
			 if(i%20==0) {
				 suma++;
				 System.out.println("Es divisible por 20 : "+i);
				 
			 }else {System.out.println("NO es divisible por 20 : "+i);}
			 
		 }
		
		System.out.println("El valor del contador es : "+suma);

	}

}
