package struct.composite.first;

public class Client {
    public static void main(String[] args) {
        MyElement obj1,obj2,obj3,obj4,obj5;

        Plate plate1,plate2,plate3;


        obj1=new Apple();
        obj2 = new Banana();
        obj3 = new Apple();
        obj4 = new Pear();
        obj5 = new Banana();

//        //将水果放入1号小盘子中
//        plate1 = new Plate();
//        plate1.add(obj1);
//        plate1.add(obj2 );
//
//        //将水果放入2号小盘子中
//        plate2 = new Plate();
//        plate2.add(obj3);
//        plate2.add(obj4);
//        plate2.add(obj5);

        //将果盘1,2放入大果盘3中
//        plate3 = new Plate();
//        plate3.add(obj5);
//        plate3.add(plate1);
//        plate3.add(plate2);
//
//        plate3.eat();

    }
}
