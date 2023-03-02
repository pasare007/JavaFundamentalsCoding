package ro.sda.fundamentals._6_Classes.part_2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {


        SimpleCalculator calc = new SimpleCalculator();
        SimpleCalculator anotherCalc = new SimpleCalculator();

        calc.setFirstNumber(100.73);
        calc.setSecondNumber(50.23);

        anotherCalc.setFirstNumber(56.70);
        anotherCalc.setSecondNumber(0.0);


        DecimalFormat df = new DecimalFormat ("#.###");

        System.out.println("Additional result: " + calc.getAdditionalResult());
        System.out.println("Subtraction result: " + df.format(calc.getSubtractionResult()));
        System.out.println("Multiplication result: " + calc.getMultiplicationResult());
        System.out.format("Division result: %.3f \n ", + calc.getDivisionResult());

        System.out.println("Additional result: " + anotherCalc.getAdditionalResult());
        System.out.println("Subtraction result: " + anotherCalc.getSubtractionResult());
        System.out.println("Multiplication result: " + anotherCalc.getMultiplicationResult());
        System.out.println("Division result: " + anotherCalc.getDivisionResult());

        SimpleCalculator calc2 = new SimpleCalculator(29.23, 12.67);
        System.out.println("Additional result: " + calc2.getAdditionalResult());
        System.out.println("Subtraction result: " + calc2.getSubtractionResult());
    }

}
