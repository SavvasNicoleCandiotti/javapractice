import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("main");
        String fullName = "Kayla Hannon ";
        String firstname = "Kayla";
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = fullName.charAt(0);
        char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;

        System.out.print(studentFirstInitial + ' ' + studentLastInitial + "has a GPA of" + " " + studentGPA);

        System.out.println("What do you want to update it to? ");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(firstname + " " + studentLastInitial + "now has a GPA of " + studentGPA);
    }

}
