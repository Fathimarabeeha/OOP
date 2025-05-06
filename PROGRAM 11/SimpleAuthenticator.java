import java.util.Scanner;

// Base custom exception 
class AuthenticationException extends Exception {
public AuthenticationException(String message) {
super(message);
}
}

// Custom exception for invalid username
class InvalidUsernameException extends AuthenticationException {
public InvalidUsernameException(String username) {
super("Invalid username: " + username);
}
}

// Custom exception for invalid password
class InvalidPasswordException extends AuthenticationException {
public InvalidPasswordException() {
super("Invalid password.");
}
}

// Main class with authentication logic
public class Authenticator {

// Hardcoded valid credentials
private static final String VALID_USERNAME = "admin";
private static final String VALID_PASSWORD = "password123";

// Authentication method
public static void authenticate(String username, String password) throws AuthenticationException {
if (!username.equals(VALID_USERNAME)) {
throw new InvalidUsernameException(username);
}

if (!password.equals(VALID_PASSWORD)) {
throw new InvalidPasswordException();
}

System.out.println("Authentication successful!");
}

// Main method
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter username: ");
String inputUsername = scanner.nextLine();

System.out.print("Enter password: ");
String inputPassword = scanner.nextLine();

try {
authenticate(inputUsername, inputPassword);
} catch (AuthenticationException e) {
System.out.println("Authentication failed: " + e.getMessage());
}
scanner.close();
}
}

