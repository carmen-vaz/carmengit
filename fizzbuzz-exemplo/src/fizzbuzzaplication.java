
public class fizzbuzzaplication {
	public static void main(string[]args) {
		for(int contador = 1; contador< 101; contador++) {
			if (contador % 3==0) {
				System.out.println("Fizz");
				}else if (contador % 5==0) {
					System.out.println("Buzz");
				}else {System.out.println(contador);
				
				}
		}
	}
}
