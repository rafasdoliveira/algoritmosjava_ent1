package algortimosjava;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		try (Scanner n = new Scanner(System.in)) {
		int num;
		int numDivisores=0;
		
		System.out.print("Informe um numero");
		num = n.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				numDivisores++;
				}
			}
		if(numDivisores==2) {
			System.out.print("O numero eh primo");
			} else {
			System.out.print("O numero nao eh primo");
			}
		}
	}
}