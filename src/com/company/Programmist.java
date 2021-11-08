package com.company;

class Programmist extends Employee {
    private String main_prog_lang;
    private int work_exp;

    public Programmist(String name, int age, String company, int salary, String main_prog_lang, int work_exp) {
        this.setName(name);
        this.setAge(age);
        this.setCompany(company);
        this.setSalary(salary);
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
        System.out.printf("Name: %s \n", this.getName());
        System.out.printf("Age: %d \n", this.getAge());
        System.out.printf("Currently working in: %s \n", this.getCompany());
        System.out.printf("Salary: %d euro\n", this.getSalary());
        System.out.printf("Main programming language: %s \n", this.getMain_prog_lang());
        System.out.printf("Work experience: %d years \n \n", this.getWork_exp());
    }
}
