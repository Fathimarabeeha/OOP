import java.util.Scanner;
public class StringModification{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a String:");
String str = scanner.nextLine();
String result=str.trim().replace("world","java").toUpperCase();
System.out.println("Modification String:"+result);
scanner.close();
}
}
