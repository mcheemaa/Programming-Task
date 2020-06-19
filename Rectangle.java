

import java.util.Scanner;

import org.w3c.dom.css.Rect;

import java.math.BigInteger;
import java.util.*;

public class Rectangle
{
    private Integer s1 = 3;
    private Integer s2 = 4;

    public Rectangle (Integer s1, Integer s2) {

        int a = s1;
        int b = s2;
       
        double area = Area(a, b);
        int peri = a + b + a + b;

        System.out.println("Area of Rectangle is: " + area + ", and the perimeter is: " + peri);
    }

    public double Area (Integer a, Integer b) {
        return a * b;
    }

    public void setDim (Integer len, Integer bre) {
        this.s1 = len;
        this.s2 = bre;
    }

    public double getArea(){
        return Area(s1, s2);
    }
    
   public static void main(String args[]) 
    { 
        
        System.out.println("If you want to input sides press 1 or press 2 for default: ");
        Scanner che = new Scanner(System.in);
        int check = che.nextInt();
        
        if (check == 1) {

            Scanner sec = new Scanner(System.in);
        
            System.out.println("Enter the length: ");
            int a= sec.nextInt();
 
            System.out.println("Enter the breadth: ");
            int b= sec.nextInt();
 
            Rectangle fin = new Rectangle(a, b);

            fin.setDim(a, b);
            fin.getArea();

        }

        else {

            Rectangle fin = new Rectangle(3, 4);

        }          
    }
}