package POO1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quant = 0;
		float mediacampeao=0;
		float mediaperdedor=0;
		//float media=0;
		
		System.out.println("Quantos atletas vao saltar? ");
		quant = entrada.nextInt();
		
		final int TAM=5;
		float[][] saltos = new float[quant][TAM];
		float[] media = new float [quant];
		
		System.out.println("Insira os 5 saltos de cada atleta -------> ");
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < TAM; j++) {
				if(j==0) {
					System.out.println("Insira os 5 saltos do novo atleta: ");
				}
				saltos[i][j] = entrada.nextFloat();	
				media[i] = media[i] + saltos[i][j];
			}
		}
		for (int i = 0; i < quant; i++) {
			for (int j = 0; j < TAM; j++) {
				if(j==0) {
				System.out.println("Saltos do atleta "+(i+1));
				}
				System.out.println(saltos[i][j]);
				
				if(i==0 && j==(TAM-1)) {
					mediacampeao = media[i];
					mediaperdedor = media[i];
				}
				if(media[i] > mediacampeao)
					mediacampeao = media[i];
				if(media[i] < mediaperdedor)
					mediaperdedor = media[i];
				
				if(j==(TAM-1)) {
					media[i] = media[i] / TAM;
					System.out.println("Media: "+media[i]);
				}
			}	
		}
		System.out.println("A media do ganhador e: "+mediacampeao / TAM);
		System.out.println("A media do perdedor e: "+mediaperdedor / TAM);
	
		entrada.close();
	}

}
