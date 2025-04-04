package lab7;

public class Main {
    public static void main(String[] args) {

        NewIntCalculator calculator1 = new NewIntCalculator(10);
        int result1 = (Integer)calculator1.add(5).subtract(3).multiply(2).divide(3).result();
        System.out.println("5.4.2 a) " + result1);
        DoubleCalculator fCalculator = new DoubleCalculator(10);
        double result2 =(Double)fCalculator.add(5).subtract(3.3).multiply(2.2).divide(3).result();
        System.out.println("5.4.2 b) "+result2);
    }
}