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
				System.out.println("seu signo � capricornio");
			}
			else
			{
				System.out.println("seu signo � aquario");
			}
			break;
		case 2:
			if (dia<19)
			{
				System.out.println("seu signo � aquario");
			}
			else
			{
				System.out.println("seu signo � peixes");
			}
			break;
		case 3:
			if (dia<20)
			{
				System.out.println("seu signo � peixes");
			}
			else
			{
				System.out.println("seu signo � aries");
			}
			break;
		case 4:
			if (dia<20)
			{
				System.out.println("seu signo � aries");
			}
			else
			{
				System.out.println("seu signo � touro");
			}
			break;
		case 5:
			if (dia<20)
			{
				System.out.println("seu signo � touro");
			}
			else
			{
				System.out.println("seu signo � gemeos");
			}
			break;
		case 6:
			if (dia<20)
			{
				System.out.println("seu signo � gemeos");
			}
			else
			{
				System.out.println("seu signo � cancer");
			}
			break;
		case 7:
			if (dia<21)
			{
				System.out.println("seu signo � cancer");
			}
			else
			{
				System.out.println("seu signo � le�o");
			}
			break;
		case 8:
			if (dia<22)
			{
				System.out.println("seu signo � le�o");
			}
			else
			{
				System.out.println("seu signo � virgem");
			}
			break;
		case 9:
			if (dia<22)
			{
				System.out.println("seu signo � virgem");
			}
			else
			{
				System.out.println("seu signo � libra");
			}
			break;
		case 10:
			if (dia<22)
			{
				System.out.println("seu signo � libra");
			}
			else
			{
				System.out.println("seu signo � escorpi�o");
			}
			break;
		case 11:
			if (dia<21)
			{
				System.out.println("seu signo � escorpi�o");
			}
			else
			{
				System.out.println("seu signo � sagitario");
			}
			break;
		case 12:
			if (dia<21)
			{
				System.out.println("seu signo � sagitario");
			}
			else
			{
				System.out.println("seu signo � capricornio");
			}
			break;
		default:
			System.out.println("mes invalido");
			break;
		}
		
		ler.close();
	}
}
