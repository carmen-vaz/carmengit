import java.util.Scanner;

public class MediaLegal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		Integer soma=0;
		Integer contador =0		;
		do {
			soma = soma+Integer.valueOf(next);
			contador ++;
			next=scanner.next();
		} while (!next.equals("="));
		System.out.println("A soma dOS nÚMEROS É " + soma);
		Double media = new Double(soma);
		System.out.println("A media dOS números É " + (media/contador));
		scanner.close();
					
	}

}
