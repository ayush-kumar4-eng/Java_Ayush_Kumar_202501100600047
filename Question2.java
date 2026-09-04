import java.util.Scanner;

class bank_account{
    int Acc_no;
    int Balance;
    String Acc_holder_name;

    bank_account(){
        Acc_no = 9495987;
        Balance = 0;
        Acc_holder_name = "Ayush Kumar";
    }

    void deposit(Scanner sc){
        Balance = sc.nextInt();
        System.out.println("Balance = "+Balance);
    }

    void withdraw(Scanner sc){
        int withdraw = sc.nextInt();
        System.out.println("You Withdrawn = "+withdraw);
        System.out.println("Balance = "+(Balance-withdraw));
    }
}

public class Question2{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        bank_account User = new bank_account();
        User.deposit(sc);
        User.withdraw(sc);
    }
}