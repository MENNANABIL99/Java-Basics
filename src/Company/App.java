package Company;

import java.util.Scanner;

public class App {
    public static void main (String args[]){

        int mark ;

        Scanner in = new Scanner (System.in);
        System.out.println("Enter your integer");
        mark = in.nextInt();


        if(mark>=90)
               System.out.println("Your Grade Is A");

        else if(mark>=80)
            System.out.println("Your Grade Is B");

        else if(mark>=70)
            System.out.println("Your Grade Is C");

        else if(mark>=60)
            System.out.println("Your Grade Is D");

        else
            System.out.println("Fail");
        }
}
