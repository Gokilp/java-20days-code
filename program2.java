//Write a Java program that takes five numbers as input to calculate and print the average of the number
import java.util.Scanner;
public class program2 {
    public static void main(String[] agrs){
        Scanner input = new Scanner (System.in);
        System.out.println("enter the num 1");
        int num1= input.nextInt();
        System.out.println("enter the num 2 ");
        int num2= input.nextInt();
        System.out.println("enter the num 3");
        int num3 =input.nextInt();
        System.out.println("average of sum "+(num1+num2+num3)/3);
    }
}
