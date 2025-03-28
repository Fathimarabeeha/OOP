import java.util.Arrays;
import java.util.Scanner;

class recursiveBinarySearch {
    
// Recursive binary search method
public static int recursiveBinarySearch(int[] arr, int left, int right, int key) {
// Base case: if the left index exceeds the right index
if (left > right) {
return -1; // Element not found
}

// Calculate the middle index
int mid = left + (right - left) / 2;

// Check if the key is present at mid
if (arr[mid] == key) {
return mid; // Key found
}

// If key is smaller than mid, search in the left subarray
if (arr[mid] > key) {
return recursiveBinarySearch(arr, left, mid - 1, key);
}

// If key is larger than mid, search in the right subarray
return recursiveBinarySearch(arr, mid + 1, right, key);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input number of elements
System.out.println("Enter the number of elements in array:");
int a = sc.nextInt();

int[] ar = new int[a]; // Declare and initialize the array

// Input elements of the array
System.out.println("Enter the elements of the array:");
for (int i = 0; i < a; i++) {
ar[i] = sc.nextInt();
}

// Sort the array before performing binary search
Arrays.sort(ar);

// Input element to be searched
System.out.println("Enter the element to be searched:");
int e = sc.nextInt();

// Perform recursive binary search
int result = recursiveBinarySearch(ar, 0, ar.length - 1, e);

// Output result
if (result != -1) {
System.out.println("Element found at index: " + result);
} else {
System.out.println("Element not found");
}

sc.close(); // Close the scanner to avoid resource leakage
}
}
