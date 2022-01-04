package com.baozoubahashiqi.designpattern.creativepattern.prototype;

/**
 * 原型模式
 * @author 暴走吧哈士奇
 */
public class Prototype implements Cloneable {

    private int age;

    private int sex;

    private String profession;

    public Prototype(int age, int sex, String profession) {
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
