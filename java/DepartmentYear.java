import java.util.Scanner;
public class DepartmentYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int department = sc.nextInt();
        int year = sc.nextInt();
        switch (department) {
            case 1:
                System.out.println("Department: CSE");
                switch (year) {
                    case 1:
                        System.out.println("First Year");
                        break;
                    case 2:
                        System.out.println("Second Year");
                        break;
                    case 3:
                        System.out.println("Third Year");
                        break;
                    default:
                        System.out.println("Invalid!");
                }
        }
    }
}