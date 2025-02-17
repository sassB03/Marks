import java.util.Scanner;

public class Marks {
    public static void main(String[] args) { // Fixed "vooid" -> "void" and "string" -> "String"
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Add students' marks");
        System.out.println("2. Update mark");
        System.out.println("3. Get average for a subject");
        System.out.println("4. Total of a student");
        System.out.print("Enter the option: "); // Changed println to print for user input prompt
    }
}
