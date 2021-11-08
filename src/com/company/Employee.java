package com.company;

class Employee extends Human {
    private String company; //название компании
    private int salary; //зарплата в евро

    public Employee(String name, int age, String company,int salary) {
        super(name,age);
        this.setCompany(company);
        this.setSalary(salary);
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.printf("Currently working in: %s \n", this.getCompany());
        System.out.printf("Salary: %d euro\n", this.getSalary());
    }
}
