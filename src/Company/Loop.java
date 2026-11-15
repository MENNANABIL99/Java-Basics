package Company;


import java.util.Scanner;

public class Loop {
    public static void main (String args []){

    Scanner in = new Scanner(System.in);
        float sum =0,num;
        for ( float i = 1; i <=10 ; i++) {
            System.out.println("Enter Any Number");
        num =in.nextFloat();
            sum+=num;
            System.out.println("sum =" + sum);
        }
    }
}
