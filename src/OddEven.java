import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println("is an even");
        else
            System.out.println("is odd");
    }

}
