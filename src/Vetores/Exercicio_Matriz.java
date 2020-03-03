package Vetores;
import java.util.Scanner;

public class Exercicio_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] matriz = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int X = sc.nextInt();

		int count = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] == X) {
					count++;
					System.out.println("POSITION " + i + ", "+ j);
					
				if (X > j) {
					System.out.println();
				}

					
					
				}
			}
		}
		System.out.println(count);
		
	
		sc.close();

	}
}