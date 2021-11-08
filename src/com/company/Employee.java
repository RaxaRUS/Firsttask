package com.company;

class Employee extends Human {
    private String company; //название компании
    private int salary; //зарплата в евро

    Employee() {
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
}
