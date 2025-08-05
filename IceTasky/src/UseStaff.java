import java.util.Scanner;

public class UseStaff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current staff number: ");
        int number = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter the staff hiring location: ");
        String location = input.nextLine();

        StaffHiring hiring = new StaffHiring(number, location);
        System.out.println();
        hiring.printStaffHiring();
    }
}