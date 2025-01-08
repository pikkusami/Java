import java.util.Scanner;

public class Parity {

    static void printParity(int v) {

        if (v % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }

     public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int a = 0;

        System.out.println("Enter number");

        a = myObj.nextInt();
        
        printParity(a);

        myObj.close();
    }
}