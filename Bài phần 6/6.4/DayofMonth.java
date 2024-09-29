import java.util.Scanner;

public class DayofMonth {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = keyboard.nextLine();
        System.out.print("Enter the year: ");
        int year = keyboard.nextInt();
        int days = 0;
        switch (month) {
            case "January":
            case "Jan.":
            case "1":
                days = 31;
                break;
            case "February":
            case "Feb.":
            case "2":
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case "March":
            case "Mar.":
            case "3":
                days = 31;
                break;
            case "April":
            case "Apr.":
            case "4":
                days = 30;
                break;
            case "May":
            case "May.":
            case "5":
                days = 31;
                break;
            case "June":
            case "Jun.":
            case "6":
                days = 30;
                break;
            case "July":
            case "Jul.":
            case "7":
                days = 31;
                break;
            case "August":
            case "Aug.":
            case "8":
                days = 31;
                break;
            case "September":
            case "Sep.":
            case "9":
                days = 30;
                break;
            case "October":
            case "Oct.":
            case "10":
                days = 31;
                break;
            case "November":
            case "Nov.":
            case "11":
                days = 30;
                break;
            case "December":
            case "Dec.":
            case "12":
                days = 31;
                break;
            default:
                System.out.println("Invalid month. Please enter again.");
                break;
        }
        if (days != 0) {
            System.out.println("The number of days in " + month + "of year " + year + " is: " + days);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
