import java.util.Scanner;

public class Bitlen {

    static int bitLen(int n) {
        int bits = 1;
       
        bits = Integer.toBinaryString(n).length();

        return bits;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int a = 0, bits = 0;

        System.out.print("Enter number > ");

        a = myObj.nextInt();
        bits = bitLen(a);

        System.out.println(bits);

        myObj.close();
    }
}