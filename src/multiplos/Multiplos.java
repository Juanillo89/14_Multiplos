package multiplos;

import java.util.Scanner;

public class Multiplos 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		int max5 = Integer.MIN_VALUE;
		int min3 = Integer.MAX_VALUE;
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.print("Introduce número: ");
			numero = sc.nextInt();
			if(numero % 5 == 0) // Es múltiplo de 5
			{
				if(numero > max5) // Si es mayor que el maximo multiplo lo guarda
				{
					max5 = numero;
				}
			}
			if(numero % 3 == 0) // Es múltiplo de 3
			{
				if(numero < min3) // Si es menor que el minimo múltiplo lo guarda
				{
					min3 = numero;
				}
			}
		}
		sc.close();
		if(max5 == Integer.MIN_VALUE)
		{
			System.out.println("Ningún número es múltiplo de 5.");
		}
		else
		{
			System.out.println("El mayor múltiplo de 5 es el " + max5 + ".");
		}
		if(min3 == Integer.MAX_VALUE)
		{
			System.out.println("Ningún número es múltiplo de 3.");
		}
		else
		{
			System.out.println("El menor múltiplo de 3 es el " + min3 + ".");
		}
	}
}

