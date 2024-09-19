package Problemas_classicos;
import java.util.Scanner;
public class Primos {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	boolean primo;
	int divisor,i, numb ;
	System.out.println("Insira o possivel numero primo");
	numb = ler.nextInt();
	divisor=2;
	i=divisor;
	primo=true;
	if (numb <=1) {
		System.out.println("seu numero não é primo");
	}else {
	while (i <= numb/2) {
		if (numb % i == 0) {
			primo = false;
		}
		i+=1;
	}
	if (primo)
	{
		System.out.println("seu numero é primo");
	} else {
		System.out.println("seu numero não é primo");
	}
	ler.close();
	}
}
}