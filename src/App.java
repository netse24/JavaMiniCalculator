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
                    saleDiscount(scanner);
                    break;
                case 3:
                    System.out.println("You chose Area of Rectangle.");
                    break;
                case 4:
                    circleArea(scanner);
                    break;
                case 5:
                    System.out.println("You chose Area of Rectangle.");
                    break;
                case 6:
                    System.out.println("You chose Area of Rectangle.");
                    break;
                case 7:
                    System.out.println("You chose Area of Rectangle.");
                    break;
                case 8:
                    calculation(scanner);
                    break;
                case 9:
                    System.out.println("You chose Area of Rectangle.");
                    break;
                case 10:
                    System.out.println("You chose Area of Rectangle.");
                    break;
            }

        } while (true);

    }

    public static void studentRemark(Scanner scanner) {
        char repeat;
        do {
            System.out.print("Enter the student's score (0-100): ");
            double score = scanner.nextDouble();

            String grade = "N/A";
            String mention = "Invalid score";

            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
            } else {
                if (score >= 85) {
                    grade = "A";
                    mention = "Excellent";
                } else if (score >= 80) {
                    grade = "B+";
                    mention = "Very Good";
                } else if (score >= 70) {
                    grade = "B";
                    mention = "Good";
                } else if (score >= 65) {
                    grade = "C+";
                    mention = "Fairly Good";
                } else if (score >= 60) {
                    grade = "C";
                    mention = "Fair";
                } else if (score >= 50) {
                    grade = "D";
                    mention = "Poor";
                } else if (score >= 45) {
                    grade = "E";
                    mention = "Very Poor";
                } else {
                    grade = "F";
                    mention = "Failure";
                }

                System.out.println("Grade: " + grade);
                System.out.println("Mention: " + mention);
            }

            System.out.print("Enter 'y' to calculate again, any key to go back to the menu: ");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();

        } while (repeat == 'y' || repeat == 'Y');
    }

    // Sale with discount
    public static void saleDiscount(Scanner scanner) {
        char repeat;
        do{
            System.out.print("Please enter amount of price you be paid: ");
            double price = scanner.nextDouble();
            double amountDiscount = 0;
            
            if(price >= 1 && price <= 25){
                amountDiscount = price;
            }else if( price >= 25 && price <= 50){
                amountDiscount = 0.02 * price;
            }else if(price >= 50 && price <= 100){
                amountDiscount = 0.10 * price;
            }else if(price >= 100 && price < 200){
                amountDiscount = 0.15 * price;
            }else if(price >= 200 && price < 300){
                amountDiscount = 0.20 * price;
            }else if(price >= 300 && price < 500){
                amountDiscount = 0.50 * price;
            }else{
                amountDiscount = 0.75 * price;
            }

            System.out.println("amount you be paid: " + price + " Final amount after discount: " + (price-amountDiscount));
            System.out.print("Enter 'y' or 'Y' to try again, any key to go back to the menu: ");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();
        }while (repeat == 'y' || repeat == 'Y');
        
    }
   
    //Area of Circle//
    public static void circleArea(Scanner scanner) {
        char repeat;
        do {
            double A, radius;
            
            System.out.println("Enter radius: ");
            radius = scanner.nextFloat();
            A = Math.PI * Math.pow(radius, 2);  
            System.out.printf("Area of Circle is equal= %.2f\n", A); 
    
            System.out.print("Enter 'y' or 'Y' to try again, any key to go back to the menu: ");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();
        } while (repeat == 'y' || repeat == 'Y');
    }
    
    

    public static void calculation(Scanner scanner) {
        char repeat;
        double firstValue;
        double secondValue;
        int operator = 0;
        do {

            System.out.print("Enter first value: ");
            firstValue = scanner.nextDouble();

            System.out.println("============= Choose Operators =============");
            String operatorOption[] = {
                    "Sum",
                    "Subtract",
                    "Multiply",
                    "Division"
            };

            for (int i = 0; i < operatorOption.length; i++) {
                System.out.println((i + 1) + ". " + operatorOption[i]);

            }
            System.out.print("Enter operator : ");
            String input = scanner.next();

            System.out.print("Enter second value: ");
            secondValue = scanner.nextDouble();

            boolean isValidOperator = false;
            while (!isValidOperator) {
                try {
                    operator = Integer.parseInt(input);
                    if (operator >= 1 && operator <= 4) {
                        isValidOperator = true;
                    } else {
                        System.out.println("Invalid operator. Please choose a number between 1 and 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Exiting the program.");
                    scanner.close();
                    return;
                }
            }

            double result = 0;
            switch (operator) {
                case 1:
                    result = firstValue + secondValue;
                    break;
                case 2:
                    result = firstValue - secondValue;
                    break;
                case 3:
                    result = firstValue * secondValue;
                    break;
                case 4:
                    if (secondValue != 0) {
                        result = firstValue / secondValue;
                    } else {
                        System.out.println("Error: Division by zero.");
                        scanner.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Exiting the program.");
                    scanner.close();
                    return;
            }

            System.out.println("The result is: " + result);

            System.out.print("Enter 'y' to calculate again, any key to go back to the menu: ");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();

        } while (repeat == 'y' || repeat == 'Y');
    }

}
