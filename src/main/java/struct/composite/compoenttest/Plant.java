package struct.composite.compoenttest;

import java.util.ArrayList;


public class Plant extends MyElememt {
    private ArrayList list = new ArrayList();

    public void add(MyElememt myElememt) {
        list.add(myElememt);
    }
    @Override
    public void eat() {
        for (Object object:list) {
            ((MyElememt)object).eat();
        }
    }
}
