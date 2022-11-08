package unico;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas
 *  que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un 
 *  número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media 
 *  sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica 
 *  como "apto" o "no apto", por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la 
 *  recuperación? (apto/no apto). Si el resultado de la recuperación es "apto", la nota será un 5; en caso 
 *  contrario, se  mantiene la nota media anterior.
 */

		double nota1;
		double nota2;
		double media;
		String recuperacion;
		
		System.out.print("Nota del primer control: ");
	    nota1 = Double.parseDouble(teclado.nextLine());

	    System.out.print("Nota del segundo control: ");
	    nota2 = Double.parseDouble(teclado.nextLine());
	    
	    media = (nota1 + nota2) / 2;
	    
	    if (media < 5) {
	      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
	      recuperacion = teclado.nextLine();
	      if (recuperacion.equalsIgnoreCase("apto")) {
	        media = 5;
	      }
	    }
	    
	    System.out.print("Tu nota de Programación es " + media);
	}		
}