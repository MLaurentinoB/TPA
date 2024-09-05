package switchcase;
import java.util.Scanner;
public class signo {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int mes,dia;
		
		System.out.println("insira seu mes de nascimento");
		mes = ler.nextInt();
		System.out.println("insira seu dia de nascimento");
		dia = ler.nextInt();
		if (mes==2) {
			if (dia>29) {
			System.out.println("dia invalido");
			}
		}
	
		switch (mes) {
		case 1:
			if (dia<21)
			{
				System.out.println("seu signo é capricornio");
			}
			else
			{
				System.out.println("seu signo é aquario");
			}
			break;
		case 2:
			if (dia<19)
			{
				System.out.println("seu signo é aquario");
			}
			else
			{
				System.out.println("seu signo é peixes");
			}
			break;
		case 3:
			if (dia<20)
			{
				System.out.println("seu signo é peixes");
			}
			else
			{
				System.out.println("seu signo é aries");
			}
			break;
		case 4:
			if (dia<20)
			{
				System.out.println("seu signo é aries");
			}
			else
			{
				System.out.println("seu signo é touro");
			}
			break;
		case 5:
			if (dia<20)
			{
				System.out.println("seu signo é touro");
			}
			else
			{
				System.out.println("seu signo é gemeos");
			}
			break;
		case 6:
			if (dia<20)
			{
				System.out.println("seu signo é gemeos");
			}
			else
			{
				System.out.println("seu signo é cancer");
			}
			break;
		case 7:
			if (dia<21)
			{
				System.out.println("seu signo é cancer");
			}
			else
			{
				System.out.println("seu signo é leão");
			}
			break;
		case 8:
			if (dia<22)
			{
				System.out.println("seu signo é leão");
			}
			else
			{
				System.out.println("seu signo é virgem");
			}
			break;
		case 9:
			if (dia<22)
			{
				System.out.println("seu signo é virgem");
			}
			else
			{
				System.out.println("seu signo é libra");
			}
			break;
		case 10:
			if (dia<22)
			{
				System.out.println("seu signo é libra");
			}
			else
			{
				System.out.println("seu signo é escorpião");
			}
			break;
		case 11:
			if (dia<21)
			{
				System.out.println("seu signo é escorpião");
			}
			else
			{
				System.out.println("seu signo é sagitario");
			}
			break;
		case 12:
			if (dia<21)
			{
				System.out.println("seu signo é sagitario");
			}
			else
			{
				System.out.println("seu signo é capricornio");
			}
			break;
		default:
			System.out.println("mes invalido");
			break;
		}
		
		ler.close();
	}
}
