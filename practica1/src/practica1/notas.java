//Declaracion del paquete donde se encuentra la clase
package practica1;
//Importacion de la clase Scanner para entrada de datos
import java.util.Scanner;

/**
 * La clase Notas permite introducir, calcular y mostrar notas de un estudiante,y si aprobo o no.
 * @author Lauri
 */
public class notas {
	//Declaracion de las variables 
	double uf1, uf2, uf3; //Variable para las notas de las unidades formativas
	double acu1, acu2, acu3, def; //Variable para los acumulados y la nota definitiva
	//Scanner para la entrada de datos
	Scanner entrada = new Scanner(System.in);
		
	/**
	 * Metodo para ingresar las notas del estudiante
	 */
	public void IngresaNotas() {
		System.out.println("Ingrese las notas del estudiante"); //Mensaje al usuario para que ingrese las notas
			
		System.out.print("Ingrese nota 1: "); //Mensaje para solicitar la nota 1
		uf1= entrada.nextDouble(); //Captura de la nota 1

		System.out.print("Ingrese nota 2: "); //Mensaje para solicitar la nota 2
		uf2= entrada.nextDouble(); //Captura de la nota 2
		
		System.out.print("Ingrese nota 3: "); //Mensaje para solicitar la nota 3
		uf3= entrada.nextDouble(); //Captura de la nota 3
	}
		
	/**
	 * Metodo para comprobar que las notas esten en el rango correcto
	 */
	public void comprobarcion(){
		if (uf1>10) {//Comprueba si la nota 1 es mayor a 10
			System.out.println("Nota 1 mal introducida"); //Mensaje de error si la nota es mayor a 10
		}else {
			System.out.println("Nota 1 correcta"); //Mensaje si la nota es menor o igual que 10
		}
			
		if (uf2>10) {//Comprueba si la nota 2 es mayor a 10
			System.out.println("Nota 2 mal introducida"); //Mensaje de error si la nota es mayor a 10
		}else {
			System.out.println("Nota 2 correcta"); //Mensaje si la nota es menor o igual que 10
		}
		
		if (uf3>10) {//Comprueba si la nota 3 es mayor a 10
			System.out.println("Nota 3 mal introducida"); //Mensaje de error si la nota es mayor a 10
				
		}else {
			System.out.println("Nota 3 correcta"); //Mensaje si la nota es menor o igual que 10
		}			
	}
	
	/**
	 * Metodo para calcular nota final del estudiante
	 */	
	public void Calculonotas() {
		acu1 = uf1 * 0.35; //Calcula el acumulado 1 como el 35% de la nota 1
		acu2 = uf2 * 0.35; //Calcula el acumulado 2 como el 35% de la nota 2
		acu3 = uf3 * 0.30; //Calcula el acumulado 3 como el 30% de la nota 3
			
		def = acu1 + acu2+ acu3; //Calcula la nota definitiva sumando los acumulados
	}
	
	/**
	 * Metodo para mostrar las notas y la nota definitiva del estudiante
	 */
	public void Mostrar() {
		System.out.println("Las notas introducidas son:");
		//Muestra las notas y los acumulados
		System.out.println("Nota 1 = " + uf1);
		System.out.println("Nota 2 = " + uf2);
		System.out.println("Nota 3 = " + uf3);
			
		System.out.println("Acumuado 1 = " + acu1);
		System.out.println("Acumuado 2 = " + acu2);
		System.out.println("Acumuado 3 = " + acu3);
		//Muestra la nota definitiva
		System.out.println(" nota definitiva es = "+ def);	
	}
	
	/**
	 * Metodo para determinar si el estudiante aprobo o no
	 */
	public void aprobado() {
		//Comprueba si la nota definitiva esta en el rando de aprpbado		
		if(def<5 && def>=0) {
			System.out.println("Suspendido"); //Mensaje de que el estudiante esta suspenso
		}else {
			if (def>=5 && def<=10 ) {
			System.out.println("Aprobado"); //Mensaje de que el estudiante esta aprobado
			}else {
				System.out.println(" error en la notas"); //Mensaje de error si la nota esta fuera del rango
			}
		}
	}
	
	//Método para calcular promedio
	public double calculaPromedio() {
		return (uf1 + uf2 + uf3) / 3.0;
	}
			
	/**
	 * Metodo principal donde se instancia la clase Notas y se ejecutan los metodos
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion de un objeto de la clase Notas
		notas fc= new notas();
		
		//Llamada a los metodos para ingresar, calcular, mostrar y determinar si el estudiante aprobo o no
		fc.IngresaNotas();
		fc.comprobarcion();	
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}


