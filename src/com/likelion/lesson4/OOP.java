package com.likelion.lesson4;

class Person {
    public String name;
    public  String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Birthday: " + birthday;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, String birthday, double salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    private Employee assistant;

    public Manager(String name, String birthday, double salary) {
        super(name, birthday, salary);
        this.assistant = null;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        if (assistant != null) {
            return super.toString() + ", Assistant: " + assistant.getName();
        } else {
            return super.toString() + ", No Assistant";
        }
    }
}
