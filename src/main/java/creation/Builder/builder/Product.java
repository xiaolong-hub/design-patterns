package creation.Builder.builder;

public class Product {
    public String size;
    public String color;
    public String stytle;

    //设置类的get和set方法主要是为了方便建造者在建造具体产品的时候操作
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStytle() {
        return stytle;
    }

    public void setStytle(String stytle) {
        this.stytle = stytle;
    }
}
