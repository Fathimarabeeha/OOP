import java.util.Scanner;
import java.util.Arrays;		//for soring the array if needed

class Binarysearch{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);	 //short scanner name in system

//Input number of elements
System.out.println("Enter the number of elements in array :");
int n = sc.nextInt();

int[] ar = new int[n]; 	//initialize and input the array

//input element to be searched
System.out.println("Enter the elementsof the array:");
for(int i = 0; i < n; i ++){
ar[i] = sc.nextInt();
}

//Sorting the array before performing binary search
Arrays.sort(ar);

//Input element to be searched
System.out.println("Enter the element to be searched:");
int target = sc.nextInt();

//Performing binary search
int left = 0;
int right = n - 1;
boolean found = false;
while (left <= right){
int mid = (left + right) / 2; 	//calculate middle index

//check if the element is presetnt at mid
if (ar[mid] == target){
found = true;
break;
}
else if(ar[mid]<target){
left=mid+1;
}else{
right =mid - 1;
}
}

// output the result 
if (found){
System.out.println("Enter is found");
}else{
System.out.println("Enter is not found");
}

sc.close();
}
}


