import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a single character: ");
		char c = input.next().charAt(0);

		// byte, short, char, int, string, enumerated types only
		switch (c){
			case 'i': case 'e': case 'o': case 'u': case 'a': 
				System.out.println(c+ " is a vowel..."); break;
			default: 
				System.out.println(c + " is not a vowel..."); break;
		}

		
		// System.out.print("Enter a gender (m/F): ");
		// int i = input.nextInt();
		// char c = input.next().charAt(0);


		// if(c == 'm' || c == 'M'){
		// 	System.out.println("Male");
		// } else if(c == 'f' || c == 'F'){
		// 	System.out.println("Female");
		// } else {
		// 	System.out.println("Invalid input");
		// }

		// String s = "";

		// s = (i % 2 == 0) ? " even" : " odd";

		// System.out.println(i + " is" + s);



		// if(n%2 == 0) System.out.println(n + "is Even");
		// else System.out.println(n+ " is odd");
		
	}
}