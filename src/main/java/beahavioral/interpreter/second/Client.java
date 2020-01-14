package beahavioral.interpreter.second;

import beahavioral.interpreter.first.Calculator;

public class Client {
    public static void main(String[] args) {
        String statement = "3*4/2%4";
        CaculatorTwo caculatorTwo=new CaculatorTwo();
        caculatorTwo.build(statement);
        caculatorTwo.comput();
    }
}
