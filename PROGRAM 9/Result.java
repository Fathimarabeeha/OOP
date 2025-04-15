import java.util.Scanner;

interface Student {
void showAcademicScore();
}
interface Sports {
void showSportsScore();
}

class Result implements Student, Sports {
private String name;
private int academicScore;
private int sportsScore;

public Result (String name, int academicScore, int sportsScore){
this.name= name;
this.academicScore = academicScore;
this.sportsScore = sportsScore;
}

public void showAcademicScore() {
System.out.println("Student:"+name);
System.out.println("Academic Score :"+ academicScore);
}
public void showSportsScore() {
System.out.println("Sports Score :" + sportsScore);
}
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.println("Enter student's name :");
String name = scanner.nextLine();

System.out.println("Enter academic score :" );
int academicScore = scanner.nextInt();

System.out.println("Enter sports score :");
int sportsScore = scanner.nextInt();

Result student = new Result(name,academicScore,sportsScore);
student.showAcademicScore();
student.showSportsScore();
}
}
