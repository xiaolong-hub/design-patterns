package creation.Builder.easyfactory;

public class Client {
    public static  void main(String[] args) {
        TV tv;
        String productType = "海尔";

        tv=Factory.productTV(productType);
        tv.productTv();

    }
}
