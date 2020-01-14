package beahavioral.memento.test;

public class TUserInfo {
    private String name ;
    private Integer age;
    private String sex;

    public TMemento saveMemnto() {
        return new TMemento(name, age, sex);
    }

    public void restorMemnto(TMemento tMemento) {
        this.age = tMemento.getAge();
        this.name=tMemento.getName();
        this.sex = tMemento.getSex();
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

    public void show() {
        System.out.println("xingmng :" + this.getName());
        System.out.println("nianling ;" + this.getAge());
        System.out.println("性别:"+this.getSex());
    }
}
