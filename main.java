import java.util.Scanner;

public class main {
    private static double total = 0.0;
    private static boolean firstRun = true;
    private static Scanner scanner = new Scanner(System.in);

    private static int inputOperator(){
        if(firstRun){
            System.out.print("Enter the first number");
            total = scanner.nextDouble();
            firstRun = false;
        } else{
            System.out.println("Enter a number");
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

    public static void main(String[] args) {
        while(true){
            System.out.println("Total: " + total);
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulo");
            System.out.println("6. Clear Total");
            System.out.println("7. Quit");
            System.out.println("Choose Operator: ");
            int operator = inputOperator();
            switch (operator) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
            }
        }
    }

    

    
}