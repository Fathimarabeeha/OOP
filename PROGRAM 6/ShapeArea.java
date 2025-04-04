import java.util.Scanner;
public class ShapeArea{

//Function to calculate the area of a circle
public static int calculateCircleArea(int radius) {
return (int)(Math.PI * radius * radius);
}

//Function to calculate the area of a Rectangle
public static int calculateRectangleArea(int length, int width) {
return length * width;
}

//Function to calculate the area of a Triangle
 public static int calculateTriangleArea(int base, int height) {
        return (base * height) / 2;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


//Display option for the user to choose from 
System.out.println("Choose the shape to calculate area:");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Triangle");
System.out.println("Enter choice (1/2/3):");
int choice = scanner.nextInt();

int result = 0;

if( choice == 1) {
     System.out.println("Enter radius of the circle:");
     int radius = scanner.nextInt();
     result = calculateCircleArea(radius);
    
}else if (choice == 2) {
     System.out.println("Enter length and width of the rectangle:");
     int length = scanner.nextInt();
     int width = scanner.nextInt();
     result = calculateRectangleArea(length, width);
 
}else if (choice==3) {
     System.out.println("Enter base and height of the triangle:");
     int base = scanner.nextInt();
     int height = scanner.nextInt();
     result = calculateTriangleArea(base, height);
     
}else{
     System.out.println("Invalid choice");
     return;
}

//Output the result
System.out.println("The area is:" + result);
}
}
