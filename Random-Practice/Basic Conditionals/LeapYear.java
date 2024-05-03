import java.util.Scanner;

public class LeapYear {

    static void checkIfLeapYear(int year){
        System.out.println("****    LEAP YEAR IDENTIFIER    ****");

        if( year % 4 == 0 && year % 100 != 0 || year% 400 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is  not a leap year.");
        }

    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int year = scanner.nextInt();
        // scanner.close();

        checkIfLeapYear(2024);
        checkIfLeapYear(2100);
        checkIfLeapYear(3000);
        checkIfLeapYear(2028);
    }
}

