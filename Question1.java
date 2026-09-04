import java.util.Scanner;

class student{
    String name;
    int english;
    int maths;
    int science;
    int sst;
    int computer;

    void set(Scanner sc){
        name = sc.nextLine();
        english = sc.nextInt();
        maths = sc.nextInt();
        science = sc.nextInt();
        computer = sc.nextInt();
        sst = sc.nextInt();
    }

    void name(){
        System.out.println("Name = "+name);
    }

    int calculate_total(){
        return english+maths+computer+sst+science;
    }

    int calculate_percentage(){
        return calculate_total()/5;
    }

    void disp_grade(){
        if(calculate_percentage()>=90) System.out.println("A+");
        else if(calculate_percentage()>=80) System.out.println("A");
        else if(calculate_percentage()>=70) System.out.println("B");
        else if(calculate_percentage()>=60) System.out.println("C");
        else if(calculate_percentage()>=50) System.out.println("D");
        else System.out.println("F");
    }
}

public class Question1{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        student newStudent = new student();
        newStudent.set(sc);
        newStudent.name();
        System.out.println("Total marks = "+ newStudent.calculate_total());
        System.out.println("Total percentage = "+ newStudent.calculate_percentage());
        System.out.print("Your grade = ");
        newStudent.disp_grade();
    }
}