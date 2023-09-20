import java.util.Arrays;
import java.util.Scanner;

//change class to 'Main'
public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			boolean[] holiday = new boolean[30];
			Arrays.fill(holiday, false);
			for (int i = 0; i < n; i++) {
				int x = fs.nextInt();
				holiday[x-1] = true;
			}
			for (int i = 0; i < 30; i++) {
				if (i % 7 == 5 || i % 7 == 6) {
					holiday[i] = true;
				}
			}
			int counter = 0;
			for (int i = 0; i < 30; i++) {
				if (holiday[i]) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		fs.close();
	}
}
