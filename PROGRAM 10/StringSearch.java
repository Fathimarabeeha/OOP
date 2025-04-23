import java.util.Scanner;
public class StringSearch{
public static void main(String[] args){
String str = "Java Programming Language";

boolean contains = str.contains("Programming");
System.out.println("Contains 'Programming': "+ contains);

contains = str.contains("python");
System.out.println("Contains 'python':"+contains);
}
}
