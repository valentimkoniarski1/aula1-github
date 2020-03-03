package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_Listas.Product_List;

public class List_Exerci1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product_List> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.println("Inform your ID: ");
			int id = sc.nextInt();
			System.out.println("Inform your name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Inform your salary: ");
			double salary = sc.nextDouble();

			list.add(new Product_List(id, name, salary));
		}

		System.out.println("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		Product_List ID = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (ID == null) {
			System.out.println("This is id does not exist! ");
		}

		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			ID.increase_Salary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Product_List x : list) {
			System.out.println(x);
		}

		sc.close();

	}

}
