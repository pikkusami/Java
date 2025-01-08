import java.util.Scanner;

public class Asterisk {

    static void printAsterisk(int n) {
        
        System.out.println("A".repeat(n));
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int a = 0;

        System.out.print("Enter number > ");

        a = myObj.nextInt();
        printAsterisk(a);

        myObj.close();
    }
}