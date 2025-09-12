import java.util.Scanner;
public class SwapNum{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();
        System.out.println("Current -> number 1 = "+num1+" and number 2 = "+num2);
        int c=num1;
        num1=num2;
        num2=c;
        System.out.println("Swapping ..............");
        System.out.println("Now -> number 1 = "+num1+" and number 2 = "+num2);
    }
}