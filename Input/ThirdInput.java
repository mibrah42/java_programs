import java.io.*;
import java.util.*;

public class ThirdInput {
	public static void main(String[] args) {
		 Console console = System.console();
		 System.out.print("Enter username: ");
		 String username = console.readLine();
		 System.out.print("Enter password: ");
		 char[] password = console.readPassword();
		 System.out.println("your username is: " + username);
		 System.out.println("your password is: " + password);
		 System.out.println("your password value is: " + String.valueOf(password));
		 

	}
}

