import java.util.Scanner;

class Employe_Management{
    int Employee_ID;
    int Basic_Salary;
    String Name = "Ayush Kumar";

    Employe_Management(Scanner sc){
        Employee_ID = 20251775;
        System.out.print("Enter Basic Salary = ");
        Basic_Salary = sc.nextInt();
    }

    double Calculate_HRA(){
        return (0.2*Basic_Salary);
    }

    double Calculate_DA(){
        return (0.1*Basic_Salary);
    }

    double Calculate_Gross_Salary(){
        return Basic_Salary+Calculate_DA()+Calculate_HRA();
    }

    void disp(){
        System.out.println("Employee details = "+Employee_ID+" "+Name);
        System.out.println("HRA : "+Calculate_HRA());
        System.out.println("DA : "+Calculate_DA());
        System.out.println("Gross Salary : "+Calculate_Gross_Salary());
    }

}

public class Question3{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Employe_Management employee = new Employe_Management(sc);
        employee.disp();
    }
}