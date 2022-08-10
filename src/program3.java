 /*Write a Java program to print the area and perimeter of a rectangle
        Test Data:
        Width = 5.5 Height = 8.5

        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.util.Scanner;
public class program3 {
    public static void main(String[] agrs){
        float height;
        float width;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height");
        height=input.nextFloat();
        System.out.println("Enter the width");
        width=input.nextFloat();

        float peri = 2*(height+width);
        float area =width*height;
        System.out.printf("perimeter of rectangle %2f\n",peri);
        System.out.printf("area of the rectangle %2f",area);

    }
}
