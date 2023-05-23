package Strategy2;
import java.util.Scanner;

public class CulinariaBrasileira implements Culinaria{
	public void prepararPedido() {
		Scanner sc = new Scanner(System.in);
		
		double conta = 0;
		double valorFeijoada = 9.50;
		double valorCoxinha = 5.50;
		double valorBrigadeiro = 1.90;
		int indice;	
		int quant;
		String menu = ("MENU BRASILEIRO"
				+ "\nSelecione um prato:"
				+ "\n1.Feijoada.....R$9.50"
				+ "\n2.Coxinha......R$5.50"
				+ "\n3.Brigadeiro...R$1.90"
				+ "\n4.Finalizar pedido");
		boolean conf = true;
		
		while(conf) {			
			System.out.println(menu);		
			indice = sc.nextInt();
			
			switch(indice) {
			case 1:
				System.out.println("Digite a quantidade de Feijoada: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorFeijoada);
				break;
			case 2:
				System.out.println("Digite a quantidade de Coxinha: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorCoxinha);
				break;
			case 3:
				System.out.println("Digite a quantidade de Brigadeiro: ");
				quant = sc.nextInt();
				conta = conta + (quant * valorBrigadeiro);
				break;
			case 4:
				conf = false;
			}
		}		
		System.out.printf("Valor final: R$ %.2f", conta);		
	}

}
