import java.util.Scanner;

public class TimeAMPM {


    static String convertTime(String s) {

        String time24;
        
        String[] parts = s.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1].substring(0, 2));
        String period = parts[1].substring(3);

        if (period.equals("PM") && hours != 12) {
            hours += 12;
        }
        else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }

        time24 = String.format("%02d:%02d", hours, minutes);
        
        return time24;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String s, ss;

        System.out.print("Enter string > ");
        s = myObj.nextLine();

        ss = convertTime(s);

        System.out.println(ss);

        myObj.close();
    }
}