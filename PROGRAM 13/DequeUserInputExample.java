import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeUserInputExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Deque<String> deque = new ArrayDeque<>();

System.out.print("Enter first element to add at the front:");
String frontElement = scanner.nextLine();
deque.addFirst(frontElement);

System.out.print("Enter first element to add at the end:");
String endElement = scanner.nextLine();
deque.addLast(endElement);

System.out.println("Current Deque:"+deque);

String removedFront=deque.removeFirst();
System.out.println("Removed from front: " + removedFront);
System.out.println("Deque after removing from front:" + deque);

String removedEnd = deque.removeLast();
System.out.println("Remove from end: " + removedEnd);
System.out.println("Deque after removing from end: " + deque);

scanner.close();
}
}
