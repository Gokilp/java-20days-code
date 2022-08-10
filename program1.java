/*
Write a Java program to print the area and perimeter of a circle. Go to the editor
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586

 */
import java.util.Scanner;
public class program1 {
    public static void main(String[]agrs){
    double raduis,area,peri;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the raduis ");
        raduis=input.nextFloat();
        area=raduis*raduis;
        peri= (raduis*raduis)*Math.PI;
        System.out.println(area);
        System.out.println(peri);


    }
}