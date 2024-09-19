package Problemas_classicos;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int i,numb;
		
		System.out.println("Insira que queira saber o fatorial");
		numb=ler.nextInt();
		i=numb;
		while(i>0) {
			i-=1;
			if (i!=0) {
			numb=numb*i;
			}
			else {
				System.out.println("O fatorial do numero selecionado é "+numb);
			}
		}
		ler.close();
	}
}
