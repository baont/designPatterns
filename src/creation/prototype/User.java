package creation.prototype;

public class User {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeList e1 = new EmployeeList();
        e1.loadData();
        EmployeeList e2 = (EmployeeList) e1.clone();
        e2.addEmployee("Bao2");

        System.out.println(e1);
        System.out.println(e2);
    }
}
