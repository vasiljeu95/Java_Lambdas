package сom.github.vasiljeu95.javaLambdas;

import сom.github.vasiljeu95.javaLambdas.interfaces.Factorial;
import сom.github.vasiljeu95.javaLambdas.interfaces.FunctionalInterfaceWithoutParameters;
import сom.github.vasiljeu95.javaLambdas.interfaces.Operation;
import сom.github.vasiljeu95.javaLambdas.interfaces.Printer;

public class Main {

    public static double valueOne = 2.0, valueTwo = 4.0;

    public static void main(String[] args) {
        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1*value2;
            }
        };

        Operation operation1 = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return (value1*value2)*value2;
            }
        };

        System.out.println(operation.getResult(2, 4));
        System.out.println(operation1.getResult(3, 6));

        //LAMBDAS
        Operation lambdaOne = (value1, value2) -> value1 + value2;
        System.out.println("lambdaOne = " + lambdaOne.getResult(3, 10));

        Operation lambdaTwo = (value1, value2) -> value1 * value2;
        System.out.println("lambdaTwo = " + lambdaTwo.getResult(10, 5));

        Printer printerClass = new Printer() {
            @Override
            public void println(String string) {
                System.out.println("Inner class = " + string);
            }
        };
        printerClass.println("Java is good");

        Printer printerLambda = string -> System.out.println("Lambdas text = " + string);
        printerLambda.println("Java with lambdas is good");

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("factorial = " + factorial.getResult(7));

        FunctionalInterfaceWithoutParameters functionalInterface = () -> {
            valueOne = 100;
            return valueOne + valueTwo;
        };
        System.out.println("FunctionalInterfaceWithoutParameters = " + functionalInterface.getResult());
    }
}
