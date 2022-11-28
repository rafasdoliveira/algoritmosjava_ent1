package algortimosjava;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		
		try(Scanner n = new Scanner(System.in)) {
			System.out.println("Informe o número de termos da sequência: ");
			
			int num = n.nextInt();
		    int termo1= 0;
		    int termo2= 1;
		    int termo3;
		    System.out.println(termo1+", "+termo2);
		    
		    for(int i=3;i<=num;i++){
		    termo3=termo1+termo2;
		    System.out.println(", "+termo3);
		    termo1=termo2;
		    termo2=termo3;
		    }
		}
	}
}
