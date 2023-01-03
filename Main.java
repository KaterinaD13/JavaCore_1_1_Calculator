
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);//Ошибка возникает при делении на ноль.
        //В классе Calculator в переменной devide указали, что y != 0.
        int d = calc.multiply.apply(3, 7);
        int f = calc.pow.apply(d);
        int e = calc.abs.apply(-17);
        boolean s = calc.isPositive.test(-1);
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(f);
        calc.println.accept(e);
        calc.print.accept(s);
    }
}