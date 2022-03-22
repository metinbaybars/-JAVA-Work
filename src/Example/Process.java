package Example;

public class Process {
    public static void main(String[] args) {
        HospitalManagement director =new HospitalManagement();

        Employee Ali = new Doctor(10,"Ali","Business",true);

        director.callUpon(Ali);
        System.out.println(Ali);
    }
}
