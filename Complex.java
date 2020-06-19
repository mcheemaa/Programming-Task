
import java.util.Scanner;
import java.util.*;



public class Complex {

    private double real;
    private double imag;

    public Complex (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex sum (Complex num) {

        double r = this.real + num.real;
        double i = this.imag + num.imag;
        return new Complex(r, i);
    }
    public Complex dif (Complex num) {

        double r = this.real - num.real;
        double i = this.imag - num.imag;
        return new Complex(r, i);
    }
    public Complex mult (Complex num) {

        double r = (this.real * num.real) - (this.imag * num.imag);
        double i = (this.real * num.imag) + (this.imag * num.real);
        return new Complex(r, i);
    }

    public void printComplex(Complex a) {
        System.out.println("The real part is " + a.real + " and the imaginary part is " + a.imag);
    }

    public static void main(String args[]) 
    { 

        Scanner che = new Scanner(System.in);

        System.out.println("Enter the first complex number by entering the real part first: ");
        int r1 = che.nextInt();
        System.out.println("Enter the imaginary part of this complex number: ");
        int i1 = che.nextInt();

        Complex first = new Complex(r1, i1);

        System.out.println("Now enter the second complex number by entering the real part first: ");
        int r2 = che.nextInt();
        System.out.println("Enter the imaginary part of this complex number: ");
        int i2 = che.nextInt();

        Complex second = new Complex(r2, i2);


        System.out.println("Now enter 1 for addition, 2 for subtraction, or 3 for multiplication");
        int checking = che.nextInt();

        Complex fin_ans = new Complex(1, 1);

        if (checking == 1) {

            fin_ans = first.sum(second);

        }

        else if (checking == 2) {

            fin_ans = first.dif(second);

        }

        else if (checking == 3) {
            
            fin_ans = first.mult(second);

        }

        else {

            System.out.println("Please make proper selection and try again");

        }

        fin_ans.printComplex(fin_ans);


    }
}
