package org.kavish.training.usecase.collections.map.hashmap.example001;

import java.util.HashMap;
import java.util.Map;

import static org.kavish.training.utils.CodeUtils.printMap;
import static org.kavish.training.utils.CodeUtils.printObject;

public class HashMapSample {
    public static void main(String[] args) {
        Employee employee001 = new Employee(1, "Aarav", "Technology", 2500000);
        Employee employee002 = new Employee(2, "Ishaan", "Business", 3500000);
        Employee employee003 = new Employee(3, "Riya", "Accounts", 300000);
        Employee employee004 = new Employee(4, "Anika", "Operations", 1500000);
        Employee employee005 = new Employee(5, "Rohit", "Technology", 4800000);
        Employee employee006 = new Employee(6, "Nisha", "Accounts", 3200000);
        Employee employee007 = new Employee(7, "Siddharth", "Business", 4100000);
        Employee employee008 = new Employee(8, "Meera", "Operations", 1800000);
        Employee employee009 = new Employee(9, "Vikram", "Technology", 5000000);
        Employee employee010 = new Employee(10, "Priya", "Accounts", 2750000);
        //Basic Operation
        Map<Integer,Employee> employees = new HashMap<>();
        employees.put(employee001.getEmployeeId(), employee001);
        employees.put(employee002.getEmployeeId(), employee002);
        employees.put(employee003.getEmployeeId(), employee003);
        employees.put(employee004.getEmployeeId(), employee004);
        employees.put(employee005.getEmployeeId(), employee005);
        employees.put(employee006.getEmployeeId(), employee006);
        employees.put(employee007.getEmployeeId(), employee007);
        employees.put(employee008.getEmployeeId(), employee008);
        employees.put(employee009.getEmployeeId(), employee009);
        employees.put(employee010.getEmployeeId(), employee010);
        printMap(employees);
        //Retrieval
        Employee employeeDetails003 = employees.get(3);
        printObject(employeeDetails003);
        //existence
        if(employees.containsKey(5)) {
            System.out.println("Employee with Id 5 exists");
        }
        //iterate

    }
}
