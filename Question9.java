import java.util.Scanner;

class Employee{
    String Name;
    int Salary;

    void Sal_display(){
        System.out.println("Name = "+ Name);
        System.out.println("Salary = "+ Salary);
    }
}

class Manager extends Employee{
    int bonus;
    void Sal_display(int bonus){
        System.out.println("Name = "+ Name);
        System.out.println("Salary = "+ (Salary+bonus));
    }
}

public class Question9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bonus = ");
        int bonus = sc.nextInt();
        Manager emp = new Manager();
        System.out.println("Enter Name = ");
        emp.Name =sc.nextLine();
        System.out.println("Enter Salary = ");
        emp.Salary = sc.nextInt();
        emp.Sal_display(bonus);
    }
}