import java.util.Scanner;

interface Calculator{
    int add(int a, int b);
    default int multi(int a, int b){
        return a * b;
    }
    static int subtract(int a, int b){
        return a - b;
    }
}

class Calculate implements Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator math = new Calculate();
        System.out.println("숫자: " + a + ", " + b + "\n============");
        System.out.println("덧셈: " + math.add(a, b));
        System.out.println("곱셈: " + math.multi(a, b));
        System.out.println("뺼셈: " + Calculator.subtract(a, b));
    }
}
