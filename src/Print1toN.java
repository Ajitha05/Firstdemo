import java.util.Scanner;
public class Print1toN {
    public static void main(String[] args){
        int num=15;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N numbers");
         num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            System.out.println(i);
        }
    }
}
