

import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

public class Triangle
{
    private Integer s1 = 3;
    private Integer s2 = 4;
    private Integer s3 = 5;

    public Triangle(Integer s1, Integer s2, Integer s3) {

        int a = s1;
        int b = s2;
        int c = s3;

        int s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        int peri = a + b + c;

        System.out.println("Area of Triangle is: " + area + ", and the perimeter is: " + peri);
    }
    
   public static void main(String args[]) 
    { 
        
        System.out.println("If you want to input sides press 1 or press 2 for default: ");
        Scanner che = new Scanner(System.in);
        int check = che.nextInt();
        
        if (check == 1) {

            Scanner sec = new Scanner(System.in);
        
            System.out.println("Enter the 1st side: ");
            int a= sec.nextInt();
 
            System.out.println("Enter the 2nd side: ");
            int b= sec.nextInt();
 
            System.out.println("Enter the 3rd side: ");
            int c= sec.nextInt();

            Triangle fin = new Triangle(a, b, c);


        }

        else {

            Triangle fin = new Triangle(3, 4, 5);

        }          
    }
}