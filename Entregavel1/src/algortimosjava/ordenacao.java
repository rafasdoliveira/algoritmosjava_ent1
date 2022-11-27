package algortimosjava;

import java.util.Scanner;

public class ordenacao {
	
	public static void main(String[] args) {
		
		try (Scanner n = new Scanner(System.in)) {
			System.out.print("Informe a quantidade de notas");
			
			int qtd = n.nextInt();
			int nota;
			int contador = 0;
			int i = 0;
			
			while(i<qtd) {
				System.out.print("Informe uma nota");
				nota = n.nextInt();
				if(nota<5) {
					contador= contador+1;
				}
				i=i+1;
			}
			System.out.print("Quantidade de alunos aprovados: " + contador);
		}
	}
	
}
