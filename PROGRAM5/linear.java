import java.util.Scanner;
class linear{
public static void main(String args[]){
int a,i,e;                       //Convert into int
boolean found = false; 		//Use a bolean variable for clarity
Scanner sc = new Scanner(System.in);	 //short scanner name in system

//Input number of elements
System.out.println("Enter the number of elements in array :");
a=sc.nextInt();

int[] ar = new int[a]; 	//Declare and initialize the array

//input element to be searched
System.out.println("Enter the elementsof the array:");
for(i=0;i<a;i++){
ar[i] = sc.nextInt();
}

//Input element to be searched
System.out.println("Enter the element to be searched:");
e = sc.nextInt();

//Perform linear search
for(i=0;i<a;i++){
if(ar[i] == e){
found = true;  //Set found to true if element is found
break;  	//Break the loop if element is found
}
}

//Output result
if(found){
System.out.println("Enter is found ");
}
else{
System.out.println("Element is not found");
}
sc.close();	//close the scanner to avoid resource leakage
}
} 

