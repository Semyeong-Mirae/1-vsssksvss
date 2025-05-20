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
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator math = new Calculate();
        System.out.println(math.add(a, b));
        System.out.println(math.multi(a, b));
        System.out.println(Calculator.subtract(a, b));
        sc.close();
    }
}
