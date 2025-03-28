import java.util.Scanner;
import java.util.Arrays;

class arrSearch{
public static void main(String args[]) {
int a, i, e;  // Convert into int
boolean found = false;  // Use a boolean variable for clarity
Scanner sc = new Scanner(System.in);  // Short scanner name in system

// Input number of elements
System.out.println("Enter the number of elements in array:");
a = sc.nextInt();

int[] ar = new int[a];  // Declare and initialize the array

// Input elements of the array
System.out.println("Enter the elements of the array:");
for (i = 0; i < a; i++) {
ar[i] = sc.nextInt();
}

// Sort the array before performing binary search
Arrays.sort(ar);

// Input element to be searched
System.out.println("Enter the element to be searched:");
e = sc.nextInt();

// Perform binary search
int result = Arrays.binarySearch(ar, e);

// Output result
if (result >= 0) {
System.out.println("Element is found at index: " + result);
} else {
System.out.println("Element is not found");
}

sc.close();  // Close the scanner to avoid resource leakage
    }
}

