package Example;

public class Nurse extends Employee{

    public Nurse(int ID, String name, String department, boolean working) {
        super(ID, name, department, working);
        System.out.println("Nurse in action ...");
    }
}
