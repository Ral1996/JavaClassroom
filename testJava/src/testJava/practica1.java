package testJava;

public class practica1 {

	public static void main(String[] args ) {
		System.out.println("Operadores Aritmeticos");
		
		// ESTO ES UN COMENTARIO.
		
		/* 
		 * OPERADORES ARITMETICOS.
		 *  +, -, *, /, %, ^
		 *  
		 *  
		 *  */
		
		// DECLARAR VARIABLES.
		int num1 = 12, num2 = 5, num3 = 10;
		double resultado = 0, resultado2 = 0, resultado3 = 0, resultado4 = 0;
		
		resultado = num1 + num3;  // SUNATORIAS.
		resultado2 = num1 - num3; // RESTAS.
		resultado3 = num2 * num3; // MULTIPLICACIÓN.
		resultado4 = num3 / num2; // DIVISIÓN.
		
		System.out.println("\n La suma es: " + resultado);
		System.out.println("\n La resta es: " + resultado2);
		System.out.println("\n La multiplicación es: " + resultado3);
		System.out.println("\n La división es: " + resultado4);
		
		/*
		 * 
		 * OPERADORES DE DECISIÓN
		 * ==, !=, &&(and), || (or), !, True y False, >, <, >=, <=,
		 * 
		 */
		
		double l1 = 10, l2 = 6, l3 = 0;
		double hipotenusa = 0;
		
		/*
		 * a = (b^2 + c^2)^1/2
		 * 
		 *    |\
		 *    | \
		 *    |  \
		 *    |   \
		 *    |    \
		 *    |_____\
		 */
		
		hipotenusa = ((Math.pow(l1, 2)) + (Math.pow(l2, 2)));
		hipotenusa = Math.pow(hipotenusa, 0.5);
		
		System.out.println(hipotenusa);
	}
	
}
