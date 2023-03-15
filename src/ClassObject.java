import java.util.Scanner;

public class ClassObject {
    int memory = 2000;
    int storage = 3;
    public static void turnon() {
        System.out.println("Light turn on");
    }

        public static void turnoff(){
            System.out.println("Light turn of");
        }
        public static void main(){
        ClassObject sc = new ClassObject();
        turnon();
        
        }

}

