import java.util.Scanner;
public class Zodiaco {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// variaveis
	int m,d;
	System.out.println("Informe seu m�s de Nascimento");
		m = ler.nextInt();
	System.out.println("Informe seu dia de Nascimento");
		d = ler.nextInt();
	// Switch case
		switch (m) {
	// capricornio e Aquario
		case 1:
				if (d <=20 )
					System.out.println("Capric�rnio");
				else
					System.out.println("Aqu�rio");
							break;
	// Aquario e Peixes						
		case 2:
				if (d <= 18)
					System.out.println("Aqu�rio");
				else 
					System.out.println("Peixes");
							break;
	// Peixes e Aries						
		case 3:
				if (d <= 20)
					System.out.println("Peixes");
				else
					System.out.println("�ries");
							break;
	// �ries e 						
		case 4:
				if (d <= 20)
					System.out.println("�ries");
				else
					System.out.println("Touro");
							break;
		case 5:
				if (d <= 20)
					System.out.println("Touro");
				else
					System.out.println("G�meos");
							break;					
		case 6:
				if (d <= 20)
					System.out.println("G�meos");
				else
					System.out.println("C�ncer");
							break;
		case 7:
				if (d <= 22)
					System.out.println("C�ncer");
				else
					System.out.println("Le�o");
							break;				
		case 8:
				if (d <= 22)
					System.out.println("Le�o");
				else
					System.out.println("Virgem");
							break;					
		case 9:
				if (d <= 22)
					System.out.println("Virgem");
				else
					System.out.println("Libra");
							break;
		case 10:
				if (d <= 22)
					System.out.println("Libra");
				else
					System.out.println("Escorpi�o");
							break;
		case 11:
				if (d <= 21)
					System.out.println("Escorpi�o");
				else
					System.out.println("Sagit�rio");
							break;
		case 12:
				if (d <= 21)
					System.out.println("Sagit�rio");
				else
					System.out.println("Capric�rnio");
							break;				
		default:
					System.out.println("M�s Inv�lido");					
		}
		ler.close();
}
}
