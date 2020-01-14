package creation.Builder.factory;

public class Client {
    public static void main(String[] args) {
        //实例化一个工厂
        ClothesFactory clothesFactory;
        Clothes clothes;
        clothesFactory=new ZaraClothesFactory();
        clothesFactory.productClothes().prodctClothes();

    }
}
