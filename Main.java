import java.util.Scanner;

interface Calculator {
    int add(int a, int b);
    default int multi(int a, int b) {
        return a * b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
}

class Calculate implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator math = new Calculate();
        System.out.println("Numbers: " + a + ", " + b + "\n============");
        System.out.println("Addition: " + math.add(a, b));
        System.out.println("Multiplication: " + math.multi(a, b));
        System.out.println("Subtraction: " + Calculator.subtract(a, b));
    }
}
