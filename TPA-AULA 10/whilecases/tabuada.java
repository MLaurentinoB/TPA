package whilecases;
import java.util.Scanner;
public class tabuada {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int i, tab, valor;
	System.out.println("insira o numero que voce deseja saber a tabuada");
	valor = ler.nextInt();
	tab=valor;
	i=valor*10;
	while (valor<i) {
		valor+=tab;
		System.out.println(valor);
	}
	ler.close();
}
}
