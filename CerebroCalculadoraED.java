package calcualdora;


public class CerebroCalculadoraED {

	
	//Creación de las variables
	private double resultado, numero1, numero2;
	private String[] historial=  new String[5];
Operaciones operacion;
	

	
//Método get y set
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	//Método que dependiendo de la respuesta por teclado procesará el método de la respectiva opción mediante un switch case
	public void procesarOperacion(String op) {
		System.out.println("proceso " + op);
		switch (op) {
		case "1":
			operarSuma(Operaciones.SUMAR);
			break;
		case "2":
			operarResta(Operaciones.RESTAR);
			break;
		case "3":
			operarMultiplica(Operaciones.MULTIPLICAR);
			break;
		case "4":
			operarDivide(Operaciones.DIVIDIR);
			break;
		case "5":
			operarSumaRes(Operaciones.SUMAR_RES);
			break;
		case "6":
			operarRestaRes(Operaciones.RESTAR_RES);
			break;
		case "7":
			operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
			break;
		case "8":
			operarDivideRes(Operaciones.DIVIDIR_RES);
			break;
		case "9":
			mostrarResultadoActual(Operaciones.RESULTADO);
			break;
		case "10":
			numeroAleatorio(Operaciones.RANDOM);
			break;
		case "11":
			operarHistorial(Operaciones.HISTORIAL);
			break;
		default:
			System.out.println("ERROR: La operaciÃ³n " + op + " no es conocida.");
		}
	}
//Muestra la información de la operación procedente de la clase enum, utiliza un método el cual pide 2 números,
//calcula el resultado de la operación,utiliza el método el cual muestra el resultado y un último método que 
//guarda el resultado en un historial, esto sucede en la mayoría de métodos
	private void operarSuma(Operaciones op) {
		infoOperacion(op);
		resultado = numero1 + numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarResta(Operaciones op) {
		infoOperacion(op);
		resultado = numero1 - numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarMultiplica(Operaciones op) {
		infoOperacion(op);
		resultado =numero1 * numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarDivide(Operaciones op) {
		infoOperacion(op);
		resultado = numero1 / numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	//En los 4 siguientes métodos será igual a los anteriores solo que utilizará un método distinto para que solo 
	//pida 1 número en vez de 2
	private void operarSumaRes(Operaciones op) {
		infoOperacion(op);
		resultado+=numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarRestaRes(Operaciones op) {
		infoOperacion(op);
		resultado-=numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarMultiplicaRes(Operaciones op) {
		infoOperacion(op);
		resultado*=numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void operarDivideRes(Operaciones op) {
		infoOperacion(op);
		resultado/=numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	
	private void mostrarResultadoActual(Operaciones op) {
		infoOperacion(op);
		System.out.println("El valor actual del resultado es: " +resultado + "\n");
	}
	
	private void numeroAleatorio(Operaciones op) {
		infoOperacion(op);
		 resultado = (double)(Math.random()*100+1);
		System.out.println("El nÃºmero aleatorio generado es: " + resultado + "\n");
		anadirHistorialAleatorio(op);
	}
	//El siguiente método muestra todo el historial guardado mediante un for each
	private void operarHistorial(Operaciones op) {
		System.out.println("*** Historial de las cinco Ãºltimas operaciones ***");
		for (String hist : historial) {
			System.out.println(hist);
		}
		System.out.println("\n");
	}
	//Este método muestra el nombre y la información de la operación selecionada pot teclado 
	private void infoOperacion(Operaciones op) {
		System.out.println("//////////////////////////////");
		System.out.println("-> " + op.getNombre() + " - " + op.getInfo());
	}
	

	
	//Muestra el tipo de operación escogida y como es calculada con su respectivo símbolo y valores introducidos por 
	//teclado
	private void mostrarResultado(Operaciones op) {
		System.out.println("El resultado de la operaciÃ³n " + op.getNombre().toLowerCase() + " es:");
		System.out.println(numero1+ " " + op.getSimbolo() + " " + numero2+ " = "
				+resultado + "\n");
	}
	
	//MÃ©todo for el cual va guardando el historial de las 5 últimas operaciones realizadas por la calculadora, mismo caso
	//que el método anadirhistorialaleatorio
	private void anadirHistorial(Operaciones op) {

	for(int i=4;0<i;i--){
	historial[i]=historial[i-1];	
	}
	historial[0]=op.getNombre() + " -> " 
	+ numero1 
	+ " " + op.getSimbolo() + " " 
	+numero2 + " = "
	+ resultado;
	}
	
	public void anadirHistorialAleatorio(Operaciones op) {

for(int i=4;0<i;i--) {
		historial[i]=historial[i-1];
	}
historial[0]=op.getNombre() + " -> " 
+ Double.toString(resultado);

	}


}
