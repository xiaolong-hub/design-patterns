package creation.Builder.singletwo;

public class SingleTwo {
    public static SingleTwo interfaceTwo=null;

    public static SingleTwo getInstance() {
        if (interfaceTwo == null) {
            interfaceTwo = new SingleTwo();
            System.out.println("现在我已经实例化了");
        } else {
            System.out.println("我只能实例化一次,之前实例化过啦");
        }
        return interfaceTwo;
    }
}
