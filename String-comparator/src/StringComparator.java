/**
 * 
 */

/**
 * @author aluno04sala04
 *
 */
public class StringComparator {
	public static void main(String[] asrgs) {
		if (asrgs.length != 2 || asrgs == null) {
			System.out.println("VOCE NÃO ESTA COM O NÚMERO DE ARGUMENTOS CORRETOS");
		} else {
			System.out.print(asrgs[0] == asrgs[1]);
		}
	}
}