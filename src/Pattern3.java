public class Pattern3 {
    public static void main(String[] args)
    {


        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int b = 1; b <= n - i; b++) {

                // Print the white space
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }


            System.out.println("");
        }
    }
}