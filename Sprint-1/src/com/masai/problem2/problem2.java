//Print the first ten even numbers, with the help of do-while loop
//and continue keyword.
//Sample output:
//2, 4, 6, 8, 10, 12, 14, 16, 18, 20

package com.masai.problem2;

import java.util.*;

public class problem2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num = 1;
		int limit = scn.nextInt();
		do {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
			continue;
		} while (num <= limit);
		scn.close();
	}

}
