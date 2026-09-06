import java.util.Scanner;

interface Payment{
    void pay();
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Payment was initiated by UPI.");
    }
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment was initiated by Credit Card.");
    }
}

class NetBanking implements Payment{
    public void pay(){
        System.out.println("Payment was initiated by Net Banking.");
    }
}

public class Question10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for UPI \n2 for Credit Card \n3 for Net Banking");
        int n = sc.nextInt();

        
        Payment mode;

if (n == 1)
    mode = new UPI();

else if (n == 2)
    mode = new CreditCard();

else if (n == 3)
    mode = new NetBanking();

else {
    System.out.println("Invalid choice");
    return;
}

mode.pay();
    }
}