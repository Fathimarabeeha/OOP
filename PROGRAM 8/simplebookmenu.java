import java.util.Scanner;

class publisher {
String name;

publisher(String name){
this.name=name;
}
void show() {
System.out.println("Publisher:" + name);
}
}

class book extends publisher {
String title;
String author;
 
 book(String name,String title,String author){
 super(name);
 this.title=title;
 this.author=author;
}
void showbook() {
show();
System.out.println("Title:"+title);
System.out.println("Author:"+author);
}
}
class literature extends book {
literature(String name, String title, String author) {
super(name, title, author);
}

void display() {
System.out.println("\n-- literature book detailes: --");
showbook();
}
}

class fiction extends book {
fiction(String name, String title, String author) {
super(name, title, author);
}
void display() {
System.out.println("\n-- Fiction Book --");
showbook();
}
}

public class simplebookmenu {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

literature lit = new literature("DC Books","Randamoozham","M T Vasudevan Nair");
fiction fic = new fiction("Penguin","Harry Potter", "J K Rowling");

while (true) {
System.out.println("\n-- Menue --");
System.out.println("1. Show Literature Book");
System.out.println("2. Show Fiction Book");
System.out.println("3. Exit");
System.out.println("Enter your choice:");
int ch = sc.nextInt();

if (ch==1){
    lit.display();
}else if (ch==2) {
     fic.display();
}else if (ch==3){
      System.out.println("Exiting...");
break;
}else {
     System.out.println("INvalid choice.Try again.");
}
}
sc.close();
}
}

