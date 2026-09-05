import java.util.Scanner;

class Product{
    int prod_id;
    String Name;
    int price;
    int Quantity;

    // Product(int prod_id, String Name, int price, int Quantity){
    //     prod_id = prod_id;
    //     price = price;
    //     Name = Name;
    //     Quantity = Quantity;
    // }

    int totat_cost_of_each_product(){
        // System.out.println("Name = "+ Name);
        return price*Quantity;
    }

    int total_bill(){
        int bill=0;
        bill = bill+totat_cost_of_each_product();
        return bill;
    }
}

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] cart = new Product[n];

        int bill = 0;

        for (int i = 0; i < n; i++) {
            cart[i] = new Product();

            cart[i].price = sc.nextInt();
            cart[i].Quantity = sc.nextInt();

            int cost = cart[i].totat_cost_of_each_product();

            System.out.println("Total cost of each item = " + cost);
            bill = bill + cost;
        }

        if (bill)
    }
}