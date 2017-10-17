import java.io.*;
import java.util.*;

public class FirstInput {
	public static void main(String[] args) {
		BufferReader reader = new BufferReader(new InputStreamReader(System.in));
		System.out.print("Please enter your: ");
		int age = 0;
		age = Integer.parseInt(reader.readLine());
		System.out.println("You have entered: " + age);
	}
}


