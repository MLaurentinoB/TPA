package whilecases;
import java.util.Scanner;
public class nascimento {
public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int i,nas,at,idade;
	i=1;
	while(i<=6) {
		i+=1;
	System.out.println("insira seu ano de nascimento");
	nas= ler.nextInt();
	System.out.println("insira o ano atual");
	at= ler.nextInt();
	idade=at-nas;
	if(idade <18) {
		System.out.println("Sua idade é "+idade+" Voce é menor de idade");
		}
	else{
		System.out.println("Sua idade é "+idade+" Voce é maior de idade");
		}
	}
	ler.close();
}
}
