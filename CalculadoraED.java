package calcualdora;

import java.util.Scanner;

public class CalculadoraED {
//Declaración de esta clase como la controladora
	public static void main(String[] args) {
		
		//Creación de las variables
		CerebroCalculadoraED cce = new CerebroCalculadoraED();
		Scanner teclado = new Scanner(System.in);
		String entrada;
	
		do {
		//Bucle de duración hasta que la respuesta sea x, en se ejecutará el método imprimirSeleccionOp y 
		//el procesaroperacion y hará un if else para comprobar que la respuesta introducida por teclado sea válida
			imprimirSeleccionOp();
			
			entrada = teclado.next();
			if (validarEntrada(entrada)) {
				//Tras validar la entrada dependiendo de la respuesta pedirÃ¡ 1, 2 o ningÃºn mÃºmero
				switch(entrada) {
				case "1","2","3","4":
				System.out.println("Introduce el primer nÃºmero");
				double n1= teclado.nextDouble();	
				cce.setNumero1(n1);
				System.out.println("Introduce el segundo nÃºmero");
				double n2= teclado.nextDouble();
				cce.setNumero2(n2);
				break;
				case "5","6","7","8":
					
				System.out.println("Introduce el nÃºmero");
				n2= teclado.nextDouble();
				cce.setNumero2(n2);
				break;
				}
				cce.procesarOperacion(entrada);
				
				
				
				
			}else {
				System.out.println("Entrada no reconocida");
			}
		} while (!entrada.equals("x"));
		//Si la respuesta es igual a x se ejecutará el método imprimirDespedida
		imprimirDespedida();
		
	teclado.close();
	}

	private static void imprimirDespedida() {
		System.out.println("*-----------------------------------------*");
		System.out.println("*----Â¡Gracias por usar Calculadora ED!----*");
		System.out.println("*-----------------------------------------*");
	}
	
	private static void imprimirSeleccionOp() {
		System.out.println("*----------------------------------*");
		System.out.println("*----------Calculadora ED----------*");
		System.out.println("*----------------------------------*");
		for(Operaciones op: Operaciones.values())
		{
			//For each que mostrará todas las opciones posibles que tiene la calculadora
			System.out.println(op.getOpcionMenu());
	    }
		System.out.println("Â¿QuÃ© operaciÃ³n desea realizar? (x para terminar)");
	}
	
	//Método de booleanos para determinar si la entrada es válida o no
	private static boolean validarEntrada(String entrada) {
		
		boolean resp = false;
	
		
			for(Operaciones op: Operaciones.values())
			{
				if(Integer.toString(op.getId()).equals(entrada)||entrada.equals("x")) {
					resp=  true;
				}
		    }
		
			return resp;
		}
}
	


