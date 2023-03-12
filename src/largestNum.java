import java.util.Scanner;
public class largestNum{
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number");
        a = scan.nextInt();
        System.out.println("enter the second number");
        b= scan.nextInt();
        System.out.println("enter the third number");
        c= scan.nextInt();


        if(a>b && a>c){
            System.out.println(a+" is the largest ");

            if(b>a && b>c){
                System.out.println(b+" is the largest ");
            }
        }
        else{
            System.out.println(c+" is the largest ");
        }
    }
}

