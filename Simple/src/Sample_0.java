import java.util.Scanner;

/**
 * Created by hibik on 2018/03/11.
 * System.in s Sample.
 */
public class Sample_0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("入力待ち");
		String text = scanner.nextLine();
		do {
			System.out.println(text);
			text = scanner.nextLine();
		} while (text.equals("end"));
		
	}

}
