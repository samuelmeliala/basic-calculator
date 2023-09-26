import java.util.Scanner;

public class main {
    private static double total = 0.0;
    private static boolean firstRun = true;
    private static Scanner scanner = new Scanner(System.in);

    private static int inputOperator(){
        if(firstRun){
            System.out.print("Enter the first number: ");
            total = scanner.nextDouble();
            firstRun = false;
            System.out.println("Enter the operation: ");
        } else{
            System.out.println("Enter the operation: ");
        }
        int operator = scanner.nextInt();
        return operator;
    }

    private static void addition(){
        System.out.println("Enter a number to perform addition: ");
        double num = scanner.nextDouble();
        total += num;
    }

    private static void subtraction(){
        System.out.println("Enter a number to perform subtraction: ");
        double num = scanner.nextDouble();
        total -= num;
    }

    private static void multiply(){
        System.out.println("Enter a number to perform multiplication: ");
        double num = scanner.nextDouble();
        total *= num; 
    }

    private static void divide(){
        System.out.println("Enter a number to perform division: ");
        double num = scanner.nextDouble();
        if(num != 0){
            total /= num;
        }else{
            System.out.println("Cannot divide by zero (0)");
        }
    }

    private static void modulo(){
        System.out.println("Enter a number to perform modulo: ");
        double num = scanner.nextDouble();
        if(num != 0){
            total %= num;
        }else{
            System.out.println("Cannot do modulo by zero (0)");
        }
    }

    private static void clear(){
        firstRun = true;
        total = 0.0;
        System.out.println("Total has been cleared, input new number.");
    }

    public static void main(String[] args) {
        while(true){
            System.out.println("================================");
            System.out.println("Basic Calculator Program");
            System.out.println("================================");
            System.out.println("Total: " + total);
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("6. Clear Total");
            System.out.println("7. Quit");
            int operator = inputOperator();
            switch (operator) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    modulo();
                    break;
                case 6: 
                    clear();
                    break;
                case 7:
                    System.out.println("Exiting the program, thank you.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter the correct option!");
            }
        }
    }
}