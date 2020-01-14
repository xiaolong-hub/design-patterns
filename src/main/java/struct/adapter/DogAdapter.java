package struct.adapter;

public class DogAdapter extends Dog implements Robbot  {
    public void go() {
        super.run();
    }

    public void speak() {
        super.yell();
    }
}
