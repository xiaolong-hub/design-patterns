package creation.Builder.single;

public class IDCard {
    public static void setIDNumber(IDCard IDNumber) {
        IDCard.IDNumber = IDNumber;
    }

    private static IDCard IDNumber=null;

    public static IDCard getIDNumber() {
        if (IDNumber == null) {
            IDNumber = new IDCard();

        } else {

        }

        return IDNumber;
    }
}
