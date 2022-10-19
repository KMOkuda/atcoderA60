import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.sun.tools.javac.code.Type.ForAll;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int price[] = new int[N];
		int ans[] = new int[N];
		

		TreeMap<Integer, Integer> priceMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {

			price[i] = sc.nextInt();
			priceMap.put(price[i], i + 1);

			if (i == 0) {
				ans[i] = -1;
			} else {
				priceMap.
			}

			if (i != 0) {
				System.out.print(" ");
			}

			System.out.print(ans[i]);
		}
	}
}
