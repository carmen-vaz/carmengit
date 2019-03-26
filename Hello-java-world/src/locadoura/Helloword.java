package locadoura;

public class Helloword {

	public static void main(String[] asrgs) {
		if (asrgs == null || asrgs.length == 0) {
			System.out.println("voce não informou nenhum " + " argumento");

		} else {

			System.out.println("hello java word");
			for (int i = 0; i < asrgs.length; i++) {
				System.out.print(asrgs[i] + " ");
			}
		}
	}
}
