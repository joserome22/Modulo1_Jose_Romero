package ar.com.golballogic.bootcamp.ejercicioindividual.controldeflujo;

public class Ejercicio43 {
	
	public static void main(String[] args) {
		int valorCompra=300;
		double descuento;
		if(valorCompra==300) {
			descuento=300*0.20;
			
			System.out.println("El descuento es:  "+descuento+" $");
		}else {if(valorCompra>350) {
			descuento=300*0.25;
			
			System.out.println("El descuento es:  "+descuento+" $");
		}else {
			
			System.out.println("Sin descuentos, el total es:  "+valorCompra+" $");
			}
		
		}

	}

}
