package POO1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n =0;
		float soma=0;
		float mediaturma=0;
		int cont=0;
		float maiornota=0;
		String nomemaiornota=" ";
		float menornota=0;
		String nomemenornota=" ";
		float maiormedia=0;
		String nomemaiormedia=" ";
		float menormedia=0;
		String nomemenormedia=" ";
		
		
		
		System.out.println("Insira o numeros de alunos: ");
		n = entrada.nextInt();
	
		float[] mediaaluno = new float[n];
		float[][] nota = new float[n][2];
		String [] nome = new String[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				cont++;
				if(j==0) {
				System.out.println("Nome do aluno "+(i+1)+"?");
				nome[i] = entrada.next();
				}
				if(j==0) {
					System.out.println("Nota "+(j+1)+" do aluno "+(i+1)+"?");
					nota[i][0] = entrada.nextFloat();
				}
				if(j==1) {
					
					System.out.println("Nota "+(j+1)+" do aluno "+(i+1)+"?");
					nota[i][1] = entrada.nextFloat();
					mediaaluno[i] = (nota[i][0] + nota[i][1]) / 2;

				}
				
				if(i == 0 && j == 1) {
					if(nota[i][0] > nota[i][1]) {
					maiornota = nota[i][j];
					nomemaiornota =  nome[i];
					menornota = nota[i][j];
					nomemenornota =nome[i];
				}
				}
				if(i == 0 && j == 1) {
					if(nota[i][0] < nota[i][1]) {
					maiornota = nota[i][j];
					nomemaiornota =  nome[i];
					menornota = nota[i][j];
					nomemenornota =nome[i];
					}
					}
				if(i==1) {
					maiormedia = mediaaluno[i-1];
					nomemaiormedia =nome[i-1];
					menormedia = mediaaluno[i-1];
					nomemenormedia = nome[i-1];
				}
				if(nota[i][j] < menornota) {
					menornota = nota[i][j];
					nomemenornota = nome[i];
				}
				if(nota[i][j] > maiornota) {
					maiornota = nota[i][j];
					nomemaiornota =  nome[i];
				}
				if(mediaaluno[i] > maiormedia) {
					maiormedia = mediaaluno[i];
					nomemaiormedia =nome[i];
				}
				if(mediaaluno[i]< menormedia) {
					menormedia = mediaaluno[i];
					nomemenormedia = nome[i];
				}	
				
				soma = soma + nota[i][j];
				
			}
		}
		for (int i1 = 0; i1 < nota.length; i1++) {
			//for (int j = 0; j < nota.length; j++) {
				System.out.println("Aluno "+(i1+1)+": "+nome[i1]);
				System.out.println("Nota 1: "+nota[i1][0]);
				System.out.println("Nota 2: "+nota[i1][1]);
				System.out.println("A media do aluno foi: "+mediaaluno[i1]+" \n");
		//	}	
		}
		mediaturma = soma / cont;
		System.out.println("A maior nota e: "+maiornota+" de: "+nomemaiornota);
		System.out.println("A menor nota e: "+menornota+" de: "+nomemenornota);
		System.out.println("A maior media e: "+maiormedia+" de: "+nomemaiormedia);
		System.out.println("A menor media e: "+menormedia+" de: "+nomemenormedia);
		System.out.println("A media da turma e: "+mediaturma+" \n");
		for (int j = 0; j < nome.length; j++) {
			for (int j2 = 0; j2 < nome.length; j2++) {
				if(mediaaluno[j] < mediaturma)
					System.out.println(nome[j]+" esta abaixo da media");
				if(mediaaluno[j] > mediaturma)
					System.out.println(nome[j]+" esta acima da media");
					
			}
		}
		entrada.close();
	}

}
