package Company;


import java.util.Scanner;

public class newclass {
    static int min(int n1 , int n2 , int n3){
        int minnumber = n1;
        if(minnumber > n2)
            minnumber = n2;
        if(minnumber > n3)
            minnumber = n3;

        return minnumber;
    }
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        int x , y , z;
        System.out.println("enter # 1 =");
        x = in.nextInt();
        System.out.println("enter # 2 =");
        y=in.nextInt();
        System.out.println("enter # 3 =");
        z=in.nextInt();

        System.out.println("minnumber =" + min(x,y ,z));


    }




     {

    }
}
