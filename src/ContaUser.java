import java.util.Scanner;

import model.ContaBancaria;

public class ContaUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		
		
		System.out.println("Por favor, digite o número!");
		conta.setNumero(scan.nextInt());
		System.out.println("Agora numero da agencia");
		conta.setAgencia(scan.next());
		System.out.println("Digite seu nome e sobrenome!");
		scan.nextLine();
		conta.setNome(scan.nextLine());
		System.out.println("Digite seu saldo!");
		conta.setSaldo(Double.parseDouble(scan.next()));
		scan.nextLine();
		System.out.println(conta);
		
	}
}
