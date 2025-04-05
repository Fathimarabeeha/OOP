import java.util.Scanner;
class Employee {
int empid;
String name;
double salary;
String address;

public Employee(int empid, String name, double salary, String address) {
this.empid = empid;
this.name = name;
this.salary= salary;
this.address = address;
}

public void displayEmployeedetails() {
System.out.println("Employee ID: " + empid);
System.out.println("name: " + name);
System.out.println("Salary: " + salary);
System.out.println("Address: " + address);
}
}
class Teacher extends Employee {
String department;
String subjectsTaught;

public Teacher(int empid, String name, double salary,String address, String department,String subjectsTaught)  {
super(empid,name,salary,address);
this.department = department;
this.subjectsTaught = subjectsTaught;
}

public void displayTeacherdetails() {

displayEmployeedetails();
System.out.println("Department :" + department);
System.out.println("subjects Taught: " + subjectsTaught);
System.out.println(".............");
}
}
public class main {
public static void main(String[] args) {
Teacher[] teachers = new Teacher[3];


teachers[0] = new Teacher(101,"fathima",10000,"111 main st", "Mathematics","Algebra,calculus");
teachers[1] = new Teacher(102,"ayisha",20000,"584 oak st","Science","Physics,Chemistry");
teachers[2] = new Teacher(103,"Amina",10000,"545 Pine st", "Literature","English,Poetry");

for (Teacher teacher : teachers){
teacher.displayTeacherdetails();
}
}
}
