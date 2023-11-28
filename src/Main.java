public class Main {
    public static void main(String[] args) throws Exception {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        if (calc.check.test(a) || calc.check.test(b)) {
            throw new Exception("Деление на ноль");
        }
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}