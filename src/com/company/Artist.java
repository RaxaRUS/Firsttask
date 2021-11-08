package com.company;

class Artist extends Employee {
    private String specialisation;
    private int work_exp;

    public Artist(String name, int age, String company, int salary, String specialisation, int work_exp) {
        this.setName(name);
        this.setAge(age);
        this.setCompany(company);
        this.setSalary(salary);
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
        System.out.printf("Name: %s \n", this.getName());
        System.out.printf("Age: %d \n", this.getAge());
        System.out.printf("Currently working in: %s \n", this.getCompany());
        System.out.printf("Salary: %d euro\n", this.getSalary());
        System.out.printf("Artist specialisation: %s \n", this.getSpecialisation());
        System.out.printf("Work experience: %d years \n \n", this.getWork_exp());
    }
}