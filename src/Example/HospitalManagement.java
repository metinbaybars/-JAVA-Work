package Example;

public class HospitalManagement {

    public void callUpon(Employee employee){
        if (employee instanceof Nurse){
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        }else if (employee instanceof Doctor){
            prescribeMedicine();
            diagnoise();
        }

    }

    //nurse
    private void checkVitalSigns(){
        System.out.println("Checking vitals");

    }
    private void drawBlood(){
        System.out.println("Drawing blood");

    }
    private void cleanPatientArea(){
        System.out.println("Cleaning");
    }

    //doctor

    private void prescribeMedicine(){
        System.out.println( "prescribing the medicine");
    }
    private void diagnoise(){
        System.out.println("Diagnosing");
    }


}
