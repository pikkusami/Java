import java.util.Scanner;

public class StarBox {
    static void printBox(int n, int m) {
        while (n > 0) {
            System.out.println("A".repeat(m));
            n--;
        }
}

public static void main(String[] args){

     Scanner myObj = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.print("Enter number > ");

        a = myObj.nextInt();
        
        System.out.print("Enter number > ");

        b = myObj.nextInt();
        printBox(a, b);

        myObj.close();
}
}
