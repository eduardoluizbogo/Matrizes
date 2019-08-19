package POO1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float supmaiscaro=0;
		float supmaisbarato=0;
		float[] preco = new float[5];
		float media =0;
		final int TAM=5;
		float[][] vet = new float[TAM][TAM];
			
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				System.out.println("Insira o preco do mercado "+(i+1)+", produto "+(j+1)+": ");
				vet[i][j] = entrada.nextFloat();
				media = media + vet[i][j];
				
			}
		}
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				preco[i] = preco[i] + vet[i][j];
			}
		}
		for (int i = 0; i < vet.length; i++) {
			if(i == 0) {
				supmaiscaro = preco[i]; 
				supmaisbarato = preco[i]; 
			}
			if(preco[i] < supmaisbarato) {
				supmaisbarato = preco[i];
			}else if(preco[i] > supmaisbarato) {
				supmaiscaro = preco[i];
			}
			}
		media = media / 4;
		System.out.println("A media e: "+media);
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Soma de precos do supermercado "+(i+1)+": "+preco[i]);
		}
		System.out.println("O supermercado mais barato e: "+supmaisbarato);
		System.out.println("O supermercado mais caro e: "+supmaiscaro);
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				System.out.println("Preco do produto "+(j+1)+" no mercado "+(i+1)+" : "+vet[i][j]);
			}
			}							
			entrada.close();
	}
}
