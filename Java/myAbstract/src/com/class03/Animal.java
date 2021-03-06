package com.class03;

public abstract class Animal {
    private int age;
    private String name;

    // 構造方法快捷鍵 command + N
    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // getter and setter 快捷鍵： command + N
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
