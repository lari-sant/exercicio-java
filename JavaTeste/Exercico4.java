package JavaTeste;

import java.util.Scanner;

public class Exercico4 {
	public static void main(String args[])
	{
		 float n1=0, n2=0, pesoA= 1, pesoB=2, mp=0;
		 																						
		    do {
		    	System.out.println(" nota 1: ");
		    	Scanner In = new Scanner(System.in);
				n1 = In.nextFloat();
				
				System.out.println(" nota 2: ");
				Scanner Ler = new Scanner(System.in);
				n2 = Ler.nextFloat();


		        mp=(n1*pesoA + n2*pesoB) / (pesoA+pesoB);
		        System.out.println(" A media ponderada é: " + mp);

		    } while (n1 >= 0);
	}

}
