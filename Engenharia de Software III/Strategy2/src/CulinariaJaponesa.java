package Strategy2;
import java.util.Scanner;

public class CulinariaJaponesa implements Culinaria{
	public void prepararPedido() {
		Scanner sc = new Scanner(System.in);
		
		double conta = 0;
		double valorTemaki = 7.00;
		double valorSunomono = 4.5;
		double valorSushi = 2.9;
		int indice;	
		int quant;
		String menu = ("MENU JAPONÊS"
				+ "\nSelecione um prato:"
				+ "\n1.Temaki.....$7.00"
				+ "\n2.Sunomono...$4.50"
				+ "\n3.Sushi......$2.90"
				+ "\n4.Finalizar pedido");
		boolean conf = true;
		
		while(conf) {
			
			System.out.println(menu);		
			indice = sc.nextInt();
			switch(indice) {
			case 1:
				System.out.println("Digite a quantidade de Temaki: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorTemaki);
				break;
			case 2:
				System.out.println("Digite a quantidade de Sunomono: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorSunomono);
				break;
			case 3:
				System.out.println("Digite a quantidade Sushi: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorSushi);
				break;
			case 4:
				conf = false;
			}
		}		
		System.out.printf("Valor final: $ %.2f", conta);		
	}
}
