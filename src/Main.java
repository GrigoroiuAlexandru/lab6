
public class Main {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);

        NewIntCalculator calculator1 = new NewIntCalculator(10);
        int result1 = (Integer)calculator1.add(5).subtract(3).multiply(2).result();
        System.out.println("5.4.2 a) " + result1);
        DoubleCalculator fCalculator = new DoubleCalculator(10);
        double result2 =(Double)fCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.4.2 b) "+result2);
    }
}