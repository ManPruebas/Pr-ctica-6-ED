package calcualdora;

import java.util.Scanner;

public class CalculadoraED {
//Declaraci�n de esta clase como la controladora
	public static void main(String[] args) {
		
		//Creaci�n de las variables
		CerebroCalculadoraED cce = new CerebroCalculadoraED();
		Scanner teclado = new Scanner(System.in);
		String entrada;
	
		do {
		//Bucle de duraci�n hasta que la respuesta sea x, en se ejecutar� el m�todo imprimirSeleccionOp y 
		//el procesaroperacion y har� un if else para comprobar que la respuesta introducida por teclado sea v�lida
			imprimirSeleccionOp();
			
			entrada = teclado.next();
			if (validarEntrada(entrada)) {
				//Tras validar la entrada dependiendo de la respuesta pedirá 1, 2 o ningún múmero
				switch(entrada) {
				case "1","2","3","4":
				System.out.println("Introduce el primer número");
				double n1= teclado.nextDouble();	
				cce.setNumero1(n1);
				System.out.println("Introduce el segundo número");
				double n2= teclado.nextDouble();
				cce.setNumero2(n2);
				break;
				case "5","6","7","8":
					
				System.out.println("Introduce el número");
				n2= teclado.nextDouble();
				cce.setNumero2(n2);
				break;
				}
				cce.procesarOperacion(entrada);
				
				
				
				
			}else {
				System.out.println("Entrada no reconocida");
			}
		} while (!entrada.equals("x"));
		//Si la respuesta es igual a x se ejecutar� el m�todo imprimirDespedida
		imprimirDespedida();
		
	teclado.close();
	}

	private static void imprimirDespedida() {
		System.out.println("*-----------------------------------------*");
		System.out.println("*----¡Gracias por usar Calculadora ED!----*");
		System.out.println("*-----------------------------------------*");
	}
	
	private static void imprimirSeleccionOp() {
		System.out.println("*----------------------------------*");
		System.out.println("*----------Calculadora ED----------*");
		System.out.println("*----------------------------------*");
		for(Operaciones op: Operaciones.values())
		{
			//For each que mostrar� todas las opciones posibles que tiene la calculadora
			System.out.println(op.getOpcionMenu());
	    }
		System.out.println("¿Qué operación desea realizar? (x para terminar)");
	}
	
	//M�todo de booleanos para determinar si la entrada es v�lida o no
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
	


