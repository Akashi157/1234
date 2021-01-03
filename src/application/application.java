package application;

import java.util.Locale;
import java.util.Scanner;

import account.account;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			
			account = new account(number, holder, saldo);
		} else {
			account = new account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		account.deposito(deposito);
		System.out.println("Updated account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		account.saque(saque);
		System.out.print("Updated account data: \n" + account);
		
		System.out.print("Bom dia");
		sc.close();

	}

}
