package creation.Builder.factory;

public class ZaraClothesFactory implements ClothesFactory {
    public Clothes productClothes() {
        System.out.println("Zara厂生产Zara服装");
        return new ZaraClothes();
    }
}
