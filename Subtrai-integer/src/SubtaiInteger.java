
public class SubtaiInteger {

	public static void main(String[] args) {
		if (args.length != 2 || args == null) {
			System.out.println("VOCE NÃO ESTA COM O NÚMERO DE ARGUMENTOS CORRETOS");
		} else {
			Integer numA= Integer.valueOf(args[0]);
			Integer numB= Integer.valueOf(args[1]);
			System.out.print(numA-numB);
		}
	}
}
