package POO1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int soma=0;
		float media=0;
		int cont=0;
		int num=0;
		int maiorvalor=0;
		int menorvalor=0;
		int contpares=0;
		int contimpares=0;
		int somaP=0;
		int somaS=0;
		
		do {
		System.out.println("Insira um valor inteiro impar entre 3 e 11(incluindo 3 e 11): ");
		num = entrada.nextInt();
		
		if(num < 3 || num > 11 || num % 2 == 0)
			System.out.println("O valor inserido e incorreto, insira-lo novamente: ");
		
		}while(num % 2 == 0 || num < 3 || num > 11);
		
		int[][] matriz = new int[num][num];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = entrada.nextInt();
				if(i==0) {
					maiorvalor = matriz[i][j];
					menorvalor = matriz[i][j];
				}
				if(matriz[i][j] < menorvalor)
					menorvalor = matriz[i][j];
				
				if(matriz[i][j] > maiorvalor)
					maiorvalor = matriz[i][j];
				
				if(matriz[i][j] % 2 ==0)
					contpares++;
				
				if(matriz[i][j] % 2 !=0)
					contimpares++;
				
				if(i == j)
					somaP += matriz[i][j];
				
				if((i + j) == i+1)
					somaS += matriz[i][j];
				
				soma += matriz[i][j];
				cont++;
			}
		}
		System.out.println("A soma e: "+soma);
		
		media = soma / cont;
		System.out.println("A media e: "+media);
		
		System.out.println("O maior valor e: "+maiorvalor);
		System.out.println("O menor valor e: "+menorvalor);
		System.out.println("A quantidade de pares e: "+contpares);
		System.out.println("A quantidade de impares e: "+contimpares);
		System.out.println("A soma da diagonal principal e: "+somaP);
		System.out.println("A soma da diagonal secundaria e: "+somaS);	
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j == 0)
					System.out.println("\n");
					System.out.print(matriz[i][j]+" ");
			
			}
		}
		entrada.close();
	}

}
