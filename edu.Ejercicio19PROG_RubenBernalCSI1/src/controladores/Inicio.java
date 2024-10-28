/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 281024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr .- 281024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario el número
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		
		//Pinto el triángulo por consola
		for (int i = numero; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

	}

}
