package TPA_problemas;
import java.util.Scanner;
public class expoente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, numb,resultado ,expo;
		System.out.println("Insira a base do expoente");
		numb=ler.nextInt();
		System.out.println("Agora insira o expoente");
		expo=ler.nextInt();
		i=0;
		resultado=1;
		if (numb==1|| numb==0) {
			System.out.println("a potencia de "+numb+" é sempre "+numb);
		}
		else if (expo==0) {
			System.out.println("todo numero elevado a 0 é 0");
		}
		else if(expo==1) {
			System.out.println("todo numero elevado a 1 é ele mesmo a potencia de "+numb+" é "+numb);
		}
		else {
		while(i<expo) {
			resultado *= numb;
            i+=1;
		}
		System.out.println(resultado);
	}
		ler.close();
}
}
