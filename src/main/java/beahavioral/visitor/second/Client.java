package beahavioral.visitor.second;

public class Client {
    public static void main(String[] args) {
        SObjectStruct sObjectStruct = new SObjectStruct();
        sObjectStruct.attach(new SConElement1());
        sObjectStruct.attach(new SConElement2());

        SVisitor sVisitor = new SConVisitor1();
        SVisitor sVisitor1 = new SConVisitor2();

        sObjectStruct.accept(sVisitor);
        sObjectStruct.accept(sVisitor1);
    }

}
