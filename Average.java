

import java.util.Scanner;

import org.w3c.dom.css.Rect;

import java.math.BigInteger;
import java.util.*;

public class Average
{
    private Integer s1 = 3;
    private Integer s2 = 4;

    public Average() {

    }

    public void getAverage(Integer a, Integer b, Integer c) {
        double avg = (a + b + c) / 3;
        System.out.println(avg);

    }

   public static void main(String args[]) 
    { 
       

        Scanner sec = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sec.nextInt();
 
        System.out.println("Enter the second number: ");
        int b = sec.nextInt();

        System.out.println("Enter the third number: ");
        int c = sec.nextInt();
 
        Average fin = new Average();
        
        fin.getAverage(a, b, c);
        
    }

              
}
