package creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Cloneable {
    private List<String> employees = new ArrayList<>();

    public EmployeeList() {
    }

    public EmployeeList(List<String> employees) {
        this.employees = employees;
    }

    public void loadData() {
        employees.add("Bao");
        employees.add("An");
        employees.add("Duc");
    }

    public void addEmployee(String name) {
        employees.add(name);
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "employees=" + employees +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> newList = new ArrayList<>();
        newList.addAll(employees);
        EmployeeList employeeList = new EmployeeList(newList);
        return employeeList;
    }
}
