import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int x, aux, contaimpar = 0;
		
		x = sc.nextInt();
		aux = x;

		while (contaimpar != 6) {
			if (aux % 2!= 0){
				contaimpar = contaimpar + 1;
				System.out.println(aux);
			}
			aux = aux + 1;
		}
		sc.close();
	}
}