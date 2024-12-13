package PROJECT.ALPHABET_NOT;

import java.util.Scanner;

public class alphabetornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char wish;
		do {
			System.out.print("Enter a character to check : ");
			char ch = sc.next().toLowerCase().charAt(0);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println(ch + " is an alphabet");
			} else {
				System.out.println(ch + "is not an alphabet");
			}
			System.out.print("Do you want to check another character? y/n : ");
			wish = sc.next().toLowerCase().charAt(0);

		}

		while (wish == 'y');
		System.out.println("Program terminated.");

		sc.close();

	}

}
