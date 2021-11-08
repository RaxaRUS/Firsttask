package com.company;

class Programmist extends Employee {
    private String main_prog_lang; //основной язык программирования
    private int work_exp; //опыт работы в годах

    public Programmist(String name, int age, String company, int salary, String main_prog_lang, int work_exp) {
        super(name,age,company,salary);
        this.setMain_prog_lang(main_prog_lang);
        this.setWork_exp(work_exp);
    }

    public String getMain_prog_lang() {
        return this.main_prog_lang;
    }

    public void setMain_prog_lang(String main_prog_lang) {
        this.main_prog_lang = main_prog_lang;
    }

    public int getWork_exp() {
        return this.work_exp;
    }

    public void setWork_exp(int work_exp) {
        this.work_exp = work_exp;
    }

    public void display() {
        super.display();
        System.out.printf("Main programming language: %s \n", this.getMain_prog_lang());
        System.out.printf("Work experience: %d years \n \n", this.getWork_exp());
    }
}
