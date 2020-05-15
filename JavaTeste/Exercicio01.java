package JavaTeste;

public class Exercicio01 {
	public static void main(String args[])
	{
		int soma=0;
		int i = 1;
		for (i=1; i<=500;i++)
		{
		    if ((i%2 != 0) && (i%3 == 0))
		    {
		        soma+=i;
		    }
		}
		System.out.println(soma);
	}

}


