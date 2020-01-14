package beahavioral.visitor.second;

import java.util.ArrayList;

public class SObjectStruct {
    private ArrayList<SElement> elements = new ArrayList<>();

    public void attach(SElement sElement) {
        elements.add(sElement);

    }

    public void remove(SElement sElement) {
        elements.remove(sElement);
    }

    public void accept(SVisitor sVisitor) {
        for (SElement e:elements
             ) {
            e.accept(sVisitor);
        }
    }
}
