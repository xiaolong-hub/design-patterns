package struct.composite.first;

import struct.composite.compoenttest.MyElememt;

import java.util.ArrayList;

public class Plate extends MyElement {
    private MyElement myElement;

    public ArrayList list = new ArrayList();

    public void add(MyElememt myElement) {

        list.add(myElement);
    }

    public void remove(MyElement myElement) {
        list.remove(myElement);
    }
    @Override
    public void eat() {
        for (Object object:list) {
            ((MyElement)object).eat();

        }
    }
}
