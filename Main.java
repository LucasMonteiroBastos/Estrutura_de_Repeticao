import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		while (n != 0 ) {
			soma = soma + n;

			n = sc.nextInt();
		}
		
		System.out.println("SOMA = " + soma);
			
	}

}
