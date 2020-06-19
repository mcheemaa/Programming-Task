
import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

public class Student
{

    private String name;
    private Integer roll_no;
    private Integer phone_num = 0; 
    private String address = "NA";


    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    public Student(String name, int roll_no, Integer phone_num, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_num = phone_num;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll_no;
    }
    public void setRoll(int roll_no) {
        this.roll_no = roll_no;
    }

    public Integer getPhone() {
        return phone_num;
    }
    public void setPhone(int phone_num) {
        this.phone_num = phone_num;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        
        if (phone_num != 0) {
            System.out.println("Student's name is: " + name + " and has the roll number: " + 
            roll_no + ". Phone number of the student is: " + phone_num + ", and lastly the address is: " + address);
        }

        else{
            System.out.println("Student's name is: " + name + " and has the roll number: " + roll_no);
        }
    }

    
    public static void main(String[] args) {

        Student std_one = new Student("John", 17603, 2458, "Pakistan");
        Student std_two = new Student("Sam", 27410, 4562, "New York");

        std_one.printInfo();
        std_two.printInfo();
    }


}