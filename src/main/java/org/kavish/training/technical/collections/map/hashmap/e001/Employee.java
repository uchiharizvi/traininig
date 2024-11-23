package org.kavish.training.technical.collections.map.hashmap.e001;

public class Employee {
    private Integer employeeId;
    private String name;
    private String department;
    private Integer salary;

    public Employee(Integer employeeId, String name, String department, Integer salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    /**
     * @return id
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
