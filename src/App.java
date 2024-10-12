import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("=========== Java Mini Calculator ===========");
            System.out.println("Enter Your Function:");
            String[] options = {
                    "Student Remark",
                    "Sale with Discount",
                    "Area of Rectangle",
                    "Area of Circle",
                    "Area of Square",
                    "Area of Triangle",
                    "Area of Parallelogram",
                    "Sum, Subtract, Multiply, Division",
                    "Mini Banking (Interest Rate)",
                    "Electric Fee"
            };

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Please enter a number (1-" + options.length + ", or any other key to exit): ");
                String input = scanner.nextLine();

                try {
                    choice = Integer.parseInt(input);
                    if (choice >= 1 && choice <= options.length) {
                        validChoice = true;
                    } else {
                        System.out.println("Invalid choice. Please choose a number between 1 and 10.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                }
            }

            switch (choice) {
                case 1:
                    studentRemark(scanner);
                    break;
                case 2:
                    System.out.println("You chose Sale with Discount.");
                    break;
                case 3:
                    System.out.println("You chose Area of Rectangle.");
                    break;
            }

        } while (true);

    }

    // Calculate student remarks.
    public static void studentRemark(Scanner scanner) {
        char repeat;
        do {
            System.out.print("Enter the student's score (0-100): ");
            int score = scanner.nextInt();

            if (score >= 90) {
                System.out.println("Remark: Excellent!");
            } else if (score >= 70) {
                System.out.println("Remark: Good.");
            } else if (score >= 50) {
                System.out.println("Remark: Average.");
            } else {
                System.out.println("Remark: Needs Improvement.");
            }

            System.out.print("Enter y to calculate again, any key to go back to the menu: ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
    }
}
