package beahavioral.visitor.first;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    /**
     * 将访问元素添加到集合中
     * @param element
     */
    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e:elements
             ) {
            e.accept(visitor);

        }
    }
}
