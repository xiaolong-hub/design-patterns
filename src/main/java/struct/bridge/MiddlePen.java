package struct.bridge;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
         String penType = "中号笔";
         this.color.bePaint(penType,name);

    }
}
