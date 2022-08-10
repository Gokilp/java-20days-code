

import java.util.Scanner;

public class program12 {
    public  static void main (String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the frist number");
        int a=input.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the elemnts for array");
        for(int i=0;i<a;i++)
        {
            array[i]=input.nextInt();
            System.out.println(array[i]);
        }
    }
}
