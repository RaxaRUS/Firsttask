package com.company;

class Artist extends Employee {
    private String specialisation; //специализация художника
    private int work_exp; //опыт работы в годах

    public Artist(String name, int age, String company, int salary, String specialisation, int work_exp) {
        super(name,age,company,salary);
        this.setSpecialisation(specialisation);
        this.setWork_exp(work_exp);
    }

    public String getSpecialisation() {
        return this.specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setWork_exp(int work_exp) {
        this.work_exp = work_exp;
    }

    public int getWork_exp() {
        return this.work_exp;
    }

    public void display() {
        super.Humandisplay();
        super.Employeedisplay();
        System.out.printf("Artist specialisation: %s \n", this.getSpecialisation());
        System.out.printf("Work experience: %d years \n \n", this.getWork_exp());
    }
}