import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number: ");
        int day = sc.nextInt();
        String dayname;
        switch (day) {
            case 1:
                dayname = "Monday";
                System.out.println("The day is: " +dayname);
                break;
            case 2:
                dayname = "Tuesday";
                System.out.println("The day is: " +dayname);
                break;
            case 3:
                dayname = "Wednesday";
                System.out.println("The day is: " +dayname);
                break;
            case 4:
                dayname = "Thursday";
                System.out.println("The day is: " +dayname);
                break;
            case 5:
                dayname = "Friday";
                System.out.println("The day is: " +dayname);
                break;
            case 6:
                dayname = "Saturday";
                System.out.println("The day is: " +dayname);
                break;
            case 7:
                dayname = "Sunday";
                System.out.println("The day is: " +dayname);
                break;
            default:
                System.out.println("invalid day");
        }

    }
}