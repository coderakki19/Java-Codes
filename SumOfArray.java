package MyPrograms;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i = 0; i < N; i++) {
		    A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
	System.out.print(A[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
		sum += A[i]; 
		}
		System.out.println(sum);
		sc.close();

	}

}
