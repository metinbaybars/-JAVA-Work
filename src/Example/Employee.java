package Example;

public class Employee {
    private int ID;
    private String Name ;
    private String department;
    private boolean working;

    public Employee(int ID, String name, String department, boolean working) {
        super();
        this.ID = ID;
        Name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }


    }

