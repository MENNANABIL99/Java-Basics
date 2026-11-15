package Company;

import java.util.Scanner;

public class Example {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any number");
        /* int num;
        num = in.nextInt();

        for (int i = 1 ; i <=10 ; i++) {
            System.out.println(num+ " * " +i+"="+ (num*i)); */

        int num = in.nextInt();
        int f = 1;
        for (int i = num ; i >1; i--) {
            f = f*i;
            System.out.println("factorial =" + f );



        }



    }
}
