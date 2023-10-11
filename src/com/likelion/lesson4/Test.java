package com.likelion.lesson4;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        // Tạo các đối tượng
        Person person = new Person("John", "1990-01-15");
        Employee employee = new Employee("Alice", "1985-05-20", 50000);
        Manager manager = new Manager("Bob", "1980-03-10", 80000);

        // Gắn assistant cho manager
        manager.setAssistant(employee);

        // Đưa các đối tượng vào mảng
        people[0] = person;
        people[1] = employee;
        people[2] = manager;

        // In thông tin về các đối tượng trong mảng
        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            System.out.println(p.toString());
        }
    }
}
