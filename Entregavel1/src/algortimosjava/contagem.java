package algortimosjava;

import java.util.Scanner;

public class contagem {
	
	public static void main(String[] args) {
	
		try(Scanner n = new Scanner(System.in)) {
			System.out.println("Informe a quantidades de notas: ");
            int num = n.nextInt();
            int nota;
            int contador = 0;
            int i = 0;
            
            while(i<num){
                System.out.println("Informe uma nota");
                nota = n.nextInt();
                if(nota>=5){
                    contador = contador+1;
            }
            i = i+1;
   }
   System.out.println("Quantidade de alunos aprovados no teste: " + contador);

		}
	}
}

