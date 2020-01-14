package beahavioral.memento.pk;

public class PUserinfo {
    private String name;
    private Integer age;
    private String sex;

    public  void show() {
        System.out.println("xingming :" + getName());
        System.out.println("nianling:" + getAge());
        System.out.println("xingbie: "+getSex());
    }
    public PMemento savePMemento() {
        return new PMemento(name, age, sex);

    }

    public void restorMemento(PMemento pMemento) {
        this.age = pMemento.getAge();
        this.name = pMemento.getName();
        this.sex = pMemento.getSex();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
