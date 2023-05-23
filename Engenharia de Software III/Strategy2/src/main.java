package Strategy2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante restaurante = new Restaurante();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Selecione a Culinária: "
							+ "\n1. Brasileira"
							+ "\n2. Italiana"
							+ "\n3. Japonesa");
		int indice = sc.nextInt();
		
		switch(indice) {
		case 1:
			restaurante.setCulinaria(new CulinariaBrasileira());
			break;
		case 2:
			restaurante.setCulinaria(new CulinariaItaliana());
			break;
		case 3:
			restaurante.setCulinaria(new CulinariaJaponesa());
			break;
		}
		restaurante.cozinhar();

	}

}
