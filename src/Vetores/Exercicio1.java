package Vetores;

import java.util.Locale;
import java.util.Scanner;

import entities_Vetores.Product_exerc1;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product_exerc1[] vect = new Product_exerc1[10];

		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informe o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Informe o email: ");
			String email = sc.nextLine();
			System.out.println("Informe o quarto: ");
			int quarto = sc.nextInt();

			vect[quarto] = new Product_exerc1(name, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
