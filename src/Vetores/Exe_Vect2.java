package Vetores;

import java.util.Locale;
import java.util.Scanner;

import entities_Vetores.Product_Exe_Vect2;

public class Exe_Vect2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product_Exe_Vect2[] vect = new Product_Exe_Vect2[n];

		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product_Exe_Vect2(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.println(avg);
		
		
		
		
		

		sc.close();

	}

}
