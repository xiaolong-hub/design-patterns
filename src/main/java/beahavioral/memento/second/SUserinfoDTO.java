package beahavioral.memento.second;

import beahavioral.memento.first.Memento;

public class SUserinfoDTO {
    //自己的内容
    private String name ;
    private Integer age;
    private String sex;


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

    //保存自己的信息,前台第一次设置的信息
    public SMemento saveMemento() {
        return new SMemento(name, age, sex);

    }

    //通过备忘录恢复自己的信息,通过SMemento这样一个对象给用户的信息重新赋值
    public void restoreMemento(SMemento sMemento) {
        this.name = sMemento.getName();
        this.age = sMemento.getAge();
        this.sex = sMemento.getSex();
    }

    public void show() {
        System.out.println("姓名:" + getName());
        System.out.println("年龄:" + getAge());
        System.out.println("性别:"+getSex());
    }

}
