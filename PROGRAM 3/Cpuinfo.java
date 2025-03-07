import java.util.Scanner;

class Cpu{
int price;

class Processor{
String no_of_cores,manufacturer;

void display(){
System.out.print("Processor Manufacturer:" + manufacturer + "\n");
System.out.print("No of cores of processor:" + no_of_cores + "\n");
}
}
static class Ram{
int memory;
String manufacturer;

void display(){
System.out.println("Ram Memory:" + memory);
System.out.println("Ram Manufacture:" + manufacturer);
}
}

void display(){
System.out.println("Price:" + price);
}
}

public class Cpuinfo{
public static void main(String arg[])
{

Cpu ncpu = new Cpu();

Cpu.Processor processor = ncpu.new Processor();

Cpu.Ram ram = new Cpu.Ram();
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter the proessor Manufacturer:");
processor.manufacturer=sc.next();

System.out.println("Enter the no of cores of processor:");
processor.no_of_cores = sc.next();

System.out.println("Enter the Ram Memory size:");
ram.memory = sc.nextInt();

System.out.println("Enter the Ram Manufacturer:");
ram.manufacturer = sc.next();

System.out.println("Enter the price:");
ncpu.price = sc.nextInt();

System.out.println("\ninformationof processor and Ram:");
processor.display();
ram.display();
ncpu.display();
}
}