package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int aux;
		int num=0;
		int y=0;
		System.out.println("Quantas cartelas voce deseja preencher?");
		num = entrada.nextInt();
		
		final int TAM=6;
		int[] loteria = {7,14,22,31,40,43};
		int[][] random = new int[num][6];
		Random gerador = new Random();
		int cont=1;
		
		for (int i = 0; i < num; i++) {
			System.out.println("------------------------------");
			for (int j = 0; j < TAM; j++) {	
				cont=1;
	            do {
				y = gerador.nextInt(61);
				

				for (int k = 0; k < TAM; k++) {
					if(y != random[i][k]) {
						random[i][j] = y;
						cont++;
						
					}
						
				}
				cont++;
				System.out.println(random[i][j]);
	            }while(cont <= 6);
			}
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = i+1; j < TAM; j++) {
				for (int k = 0; k < num; k++) {							
					if(random[i][j]>random[i][k]) {
						aux=random[i][j];
						random[i][j] = random[i][k];
						random[i][j] = aux;
					
				}
			}
			System.out.println("inverso: "+random[i][j]);

		}
	}
}

}
