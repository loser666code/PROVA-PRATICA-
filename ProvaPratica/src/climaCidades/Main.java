package climaCidades;

import java.util.Scanner;

public class Main {

	static String[] cidades = { "Blumenau", "São Paulo", "Porto Alegre", "Salvador" };
	static String[] dias = { "Segunda-feira", "Trecra-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado",
			"Domingo" };
	static Double[][] temperatura = new Double[4][7];
	static Double maiorTemp = 0.0;
	static Double menorTemp;
	static int[][] abaixo15 = new int[4][4];
	static Double [] media = {0.0,0.0,0.0,0.0};

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		for (int cdd = 0; cdd < 4; cdd++) {
			for (int d = 0; d < 7; d++) {
				System.out.println("Informe aqui a temperatura de " + dias[d] + " em " + cidades[cdd]);
				temperatura[cdd][d] = scn.nextDouble();
			}
		}

		for (int cdd = 0; cdd < 4; cdd++) {
			for (int d = 0; d < 7; d++) {
				System.out.println("\n a temperatura de " + dias[d] + " em " + cidades[cdd] + " é: " + temperatura[cdd][d]);
			}
		}
		
		abaixoDe15();
		for (int i =0;i < 4; i++){
			System.out.println("\n " + cidades[i] + " tem " + abaixo15[i][i] + " dias com a temperatura abaixo de 15C");
		}
		
		maior();
		System.out.println("\n A maior temperatura é: " + maiorTemp);
		
		menor();
		System.out.println("\n A menor temperatura é: " + menorTemp);
		
		media();
		for(int i = 0; i < 4; i++) {
			System.out.println("\n A media da cidade de " + cidades[i] + " é: " + media[i]);
		}

	}
	
	public static void abaixoDe15() {
		for (int cdd = 0; cdd < 4; cdd++) {
			for (int d = 0; d < 7; d++) {
				if (temperatura[cdd][d] < 15) {
					abaixo15[cdd][cdd] += 1;
				}
			}
		}
	}

	public static void maior() {
		for (int cdd = 0; cdd < 4; cdd++) {
			for (int d = 0; d < 7; d++) {
				if (temperatura[cdd][d] > maiorTemp) {
					maiorTemp = temperatura[cdd][d];
				}
			}
		}
	}
	
	public static void media() {
		
			for (int cdd = 0; cdd < 4; cdd++) {
				for (int d = 0; d < 7; d++) {
					media[cdd] += temperatura[cdd][d];
					}
				}
			for(int i = 0; i < 4; i++) {
				media[i] = media[i]/7;
			}

	}

	public static void menor() {
		menorTemp = temperatura[0][0];
		for (int cdd = 0; cdd < 4; cdd++) {
			for (int d = 0; d < 7; d++) {
				if (temperatura[cdd][d] < menorTemp) {
					menorTemp = temperatura[cdd][d];
				}
			}
		}
	}


}
