import java.util.Scanner;
public class stringCreate{
public static void main(String[] srgs){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string:");
String input = scanner.nextLine();

String trimmed = input.trim();
String upper = trimmed.toUpperCase();
String lower = trimmed.toLowerCase();
String replaced = trimmed.replace(" ", "_");
int length = trimmed.length();
String sub= trimmed.length() >= 5 ? trimmed.substring(0,5) : trimmed;
String newMessage = trimmed.concat(" -manipulated!");

System.out.println("\nOrginal Input:'"+input+"'");
System.out.println("Trimmed:'"+trimmed+"'");
System.out.println("Uppercase:"+upper);
System.out.println("Lowercase:"+lower);
System.out.println("Replaced spaces with underscore:"+replaced);
System.out.println("Length:"+length);
System.out.println("First 5 characters:"+sub);
System.out.println("Concatenated Message:"+newMessage);

scanner.close();
}
}
