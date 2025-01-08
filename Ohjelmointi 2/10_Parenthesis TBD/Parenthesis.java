import java.util.Scanner;

public class Parenthesis {

    static boolean checkParenthesis(String s) {
        boolean isok = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (s.startsWith(")")) {
                isok = false;
                break;
            }
            else if (s.endsWith("(")) {
                isok = false;
                break;
            }
            
            if (c == '(') {
                count++;
            }
            else if (c == ')') {
                count--;
                if (count < 0) {
                    isok = false;
                }
            }
            
            if (count == 0) {
                isok = true;
            }
        }
        
        return isok;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String s;
        boolean isok = false;

        System.out.print("Enter string > ");
        s = myObj.nextLine();

        isok = checkParenthesis(s);

        System.out.println("Is parenthesis: " + isok);

        myObj.close();
    }
}
