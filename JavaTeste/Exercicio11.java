package JavaTeste;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String args[])
	{
		int i, j; 
		int m [][]= new int[5][5];
		int SL=0, SC=0;

		for (i=0; i<5; i++) { 
		for (j=0; j<5; j++) { 
		System.out.println("Digite um valor para a matriz " + i); 
		Scanner In = new Scanner(System.in);
		i = In.nextInt();
		System.out.println("Digite um valor para a matriz " + j); 
		Scanner Ler = new Scanner(System.in);
		j= Ler.nextInt();
		}
		}
		for (i=0; i<5; i++) { 
		for (j=0; j<5; j++) {
		SL = SL + m[4][j]; 
		SC = SC + m[i][4]; 
		}
		}
		 System.out.println("Soma linha" + SL); 
		 System.out.println("Soma coluna" + SC);

	}

}
