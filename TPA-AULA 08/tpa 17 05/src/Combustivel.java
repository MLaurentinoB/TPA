import java.util.Scanner;
public class Combustivel {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		double dis, capa,medio;
	System.out.println("Digite a dist�ncia percorrida :");
		dis = ler.nextDouble();
	System.out.println("Digite a capacidade do tanque em litros :");
		capa = ler.nextDouble();
		medio = dis/capa;
	if ( medio >=10) {
		System.out.println( "Econ�mico, seu gasto m�dio foi : " + medio);
	}else {
		System.out.println("N�o econ�mico, seu gasto m�dio foi : " + medio);
	}	
	ler.close ();
}

}
