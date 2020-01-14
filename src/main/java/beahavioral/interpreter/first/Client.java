package beahavioral.interpreter.first;

import struct.decorator.Car;

public class Client {
    public static void main(String[] args) {
        String statement = "3*4/2%5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result=calculator.compute();
        System.out.println(statement+"="+result);
    }
}
