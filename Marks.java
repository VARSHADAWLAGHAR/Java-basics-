import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
// //output : Enter marks: 78
// Grade: B
