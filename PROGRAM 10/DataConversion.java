public class DataConversion {
public static void main(String[] args) {
       
int number = 100;
double price = 99.99;
boolean isJavaFun = true;

        
String strNumber = String.valueOf(number);
String strPrice = String.valueOf(price);
String strBoolean = String.valueOf(isJavaFun);

      
System.out.println("String value of int: " + strNumber);
System.out.println("String value of double: " + strPrice);
System.out.println("String value of boolean: " + strBoolean);
    }
}

