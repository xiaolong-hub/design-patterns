package creation.Builder.easyfactory;

public class Factory {
    public static TV productTV(String productType) {
        if (productType.equals("海尔")) {
            System.out.println("电视机厂生产电视海尔电视机");
            return new HairTV();
        } else {
            return null;
        }
    }
}
