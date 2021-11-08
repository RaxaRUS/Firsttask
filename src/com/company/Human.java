package com.company;

class Human {
    private String name; //имя
    private int age; //возраст

    public Human(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.printf("Name: %s \n", this.getName());
        System.out.printf("Age: %d \n", this.getAge());
    }
}
