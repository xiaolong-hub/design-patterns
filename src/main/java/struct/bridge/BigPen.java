package struct.bridge;

public class BigPen extends Pen {
    //要用笔画的内容
    @Override
    public void draw(String name) {
        //用什么类型的笔去画什么东西
        String penType = "大号毛笔";
        this.color.bePaint(penType,name);
    }
}
