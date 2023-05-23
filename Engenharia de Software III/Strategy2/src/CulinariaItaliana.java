import java.util.Scanner;

public class CulinariaItaliana implements Culinaria{
	public void prepararPedido() {
		Scanner sc = new Scanner(System.in);
		
		double conta = 0;
		double valorEspaguete = 5.90;
		double valorPizza = 7.00;
		double valorRavioli = 4.50;
		int indice;	
		int quant;
		String menu = ("MENU ITALIANO"
				+ "\nSelecione um prato:"
				+ "\n1.Espaguete...$5.90"
				+ "\n2.Pizza.......$7.00"
				+ "\n3.Ravioli.....$4.50"
				+ "\n4.Finalizar pedido");
		boolean conf = true;
		
		while(conf) {
			
			System.out.println(menu);		
			indice = sc.nextInt();
			switch(indice) {
			case 1:
				System.out.println("Digite a quantidade de Espaguete: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorEspaguete);
				break;
			case 2:
				System.out.println("Digite a quantidade de Pizza: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorPizza);
				break;
			case 3:
				System.out.println("Digite a quantidade de Ravioli: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorRavioli);
				break;
			case 4:
				conf = false;
			}
		}		
		System.out.printf("Valor final: R$ %.2f", conta);
	}
}
