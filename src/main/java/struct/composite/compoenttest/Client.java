package struct.composite.compoenttest;

import struct.composite.first.Plate;

public class Client {
    public static void main(String[] args) {
        Plate plate1, plate2, plate3;
        MyElememt obj1, obj2, obj3, obj4, obj5;



        obj1 = new Apple();
        obj2 = new Pear();
        obj3 = new Apple();
        obj4 =new Apple();
        obj5 = new Pear();


        plate1=new Plate();
        plate1.add(obj1);

        plate2=new Plate();
        plate2.add(obj5);

        plate3 = new Plate();
        plate3.list.add(plate1);
        plate3.list.add(plate2);
        plate3.eat();
    }
}
