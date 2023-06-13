package employee.service;

import employee.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBookServiceImpl {

    Map<String, Employee> employees = new HashMap<>();

    public void addWorkers(String surName, String name, String patronymic) {
        Employee employee = new Employee(surName, name, patronymic);
        employees.put(employee.getSurName(), employee);
        System.out.println(employee + " добавлен ");


    }

    public void removeWorkers(String surName, String name, String patronymic) {
        Employee employee = new Employee(surName, name, patronymic);
        if (employees.containsKey(employee.getSurName())) {
            employees.remove(employee.getSurName());
            System.out.println("Сотрудник " + employee + "удален ");
            System.out.println("-----------------");
            for (Employee workers : employees.values()) {
                System.out.println("Список сотрудников - " + workers);
            }
        } else {
            System.out.println("Сотрудник не найден");
        }
    }

    public void findWorkers(String surName, String name, String patronymic) {
        Employee employee = new Employee(surName, name, patronymic);
        if (employees.containsKey(employee.getSurName())) {
            System.out.println("Найден сотрудник : " + employee);
        } else {
            System.out.println(("Сотрудник не найден"));
        }
    }


    public void listAllWorkers() {
        for (Employee workers : employees.values()) {
            System.out.println("Список всех сотрудников - " + workers);
        }

    }
}