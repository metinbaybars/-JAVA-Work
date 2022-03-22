package Example;

public class Doctor extends Employee{
    public Doctor(int ID, String name, String department, boolean working) {
        super(ID, name, department, working);
        System.out.println("Doctor in action ...");
    }
}
