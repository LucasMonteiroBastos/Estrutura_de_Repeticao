import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira 3 numeros: ");
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		int numeroMaisAlto = max(numero1, numero2, numero3);
		
		showResult(numeroMaisAlto);
	}
	
	public static int max (int i, int o, int p) {
		int maior;
		if (i > o && i > p) {
			maior = i;
		}
		else if ( o > p) {
			maior = o;
		}
		else {
			maior = p;
		}
		return maior;
	}
	
	public static void showResult(int banana) {
		System.out.println("Olha, esse é o maior valor entre os 3 numeros: " + banana);
	}

}
