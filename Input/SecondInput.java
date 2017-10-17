import java.io.*;
import java.util.*;

public class SecondInput {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		System.out.print("Enter age:  ");
		int age = in.nextInt();
		System.out.println("your name is: " + name);
		System.out.println("your age is: " + age);

	}
}

