package JavaTeste;

import java.util.Scanner;

public class Exercico5 {
	public static void main(String args[])
	{

		int numeros = 0;
		double total = 0;
		double media = 0;
	    int numero = 0;
		
	

		System.out.println("Informe um numero: ");
		Scanner In = new Scanner(System.in);
		numeros =  In.nextInt();

		while (numero >= 0) {

			numeros += 1;
			total += numero;

			System.out.println("Informe um numero: ");
			Scanner Ler = new Scanner(System.in);
			numero =  Ler.nextInt();

		}

		System.out.println("O resultado da soma: " + total);

		if (numeros == 0) {

			System.out.println("");

		} else {

			media = total / numeros;
			System.out.println("A media é: " + media);

		}
	}

}
