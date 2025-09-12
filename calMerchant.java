import java.util.Scanner;
public class calMerchant{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the price of the product (per unit): ");
        int price = sc.nextInt();
        System.out.print("Enter the quality of the product: ");
        int qua = sc.nextInt();
        if(qua>10){
            System.out.println("You get a 10% discount!");
            int totalPrice=(price*qua)+ ((price*qua)*10/100);
            System.out.println("Total price: "+totalPrice);
        }else{
            int totalPrice=price*qua;
            System.out.println("Total price: "+totalPrice);
        }
    }
}