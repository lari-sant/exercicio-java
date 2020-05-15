package JavaTeste;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String args[]){
		 
		int filhos,tf = 0 ,mediafilhos = 0;
		float salario,medias = 0 ,habitantes = 0 ,somasalario = 0,maiorsalario = 0,salcem = 0,percentual = 0;

		do
		{  
		System.out.println("Informe seu salario R$ ");
		Scanner In = new Scanner(System.in);
		salario = In.nextFloat();
		 
		habitantes += 1;
		somasalario = salario + somasalario; 
		medias = somasalario /habitantes; 
		 
		if ( maiorsalario < salario ) 
		{ 
			maiorsalario = salario; 
		}  
		if (salario <= 100)
		{ 
		salcem = salario; 
		percentual = (salcem * 100) / habitantes; 
		} 
 
		System.out.println("Informe a quantidade de filhos: "); 
		Scanner Ler = new Scanner(System.in);
		filhos = Ler.nextInt();
		tf = filhos + tf; 
		
		mediafilhos = tf / habitantes ; 
		} 
		while ( salario > -100 ); 

		System.out.println("média do salário da população R$ "+ medias); 
		System.out.println("média do número de filhos: "+ mediafilhos);
		System.out.println("O maior salario é R$  "+  maiorsalario); 
		System.out.println("Percentual de pessoas com salarios até R$100.00: " + percentual); 


		}

	}


