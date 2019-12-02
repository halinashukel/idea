package com.unicorn.Man;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Department production = new Department("Production");
        Department finance = new Department("Finance");
        Department engineering = new Department("Engineering");
        Department personnel = new Department("Personnel");

        Employee employee1 = new Employee("Ivan", "Ivanov", "Java developer");
        employee1.setCard(new IdCard(123456, LocalDate.of(2021, 10, 10)));
        employee1.setDepartment(production);
        employee1.setPastPosition(new PastPosition("engineer", engineering));
        employee1.setRoom(new Room(215));

        Employee employee2 = new Employee("Ivan", "Vasilev", "Java developer");
        employee2.setCard(new IdCard(126456, LocalDate.of(2020, 10, 10)));
        employee2.setDepartment(production);
        employee2.setPastPosition(new PastPosition("engineer", engineering));
        employee2.setRoom(new Room(215));

        Employee employee3 = new Employee("Olga", "Sergeeva", "director");
        employee3.setCard(new IdCard(12546789, LocalDate.of(2022, 5, 30)));
        employee3.setDepartment(finance);
        employee3.setPastPosition(new PastPosition("director", production));
        employee3.setRoom(new Room(318));

        Employee employee4 = new Employee("Anna", "Sergeeva", "director");
        employee4.setCard(new IdCard(2222789, LocalDate.of(2025, 7, 22)));
        employee4.setDepartment(personnel);
        employee4.setPastPosition(new PastPosition("director", personnel));
        employee4.setRoom(new Room(316));

        Employee employee5 = new Employee("Oleg", "Dorofeev", "meneger");
        employee5.setCard(new IdCard(2264789, LocalDate.of(2022, 8, 8)));
        employee5.setDepartment(finance);
        employee5.setPastPosition(new PastPosition("meneger", personnel));
        employee5.setRoom(new Room(112));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        for (Employee emp : employees) {
            if (emp.getPastPositions().get(0).getDepartment().equals(production)) {
                System.out.println(emp);
            }

        }




    }

}
