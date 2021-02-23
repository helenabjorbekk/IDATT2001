package hb.ntnu.idatt2001.MappeDel1;
import hb.ntnu.idatt2001.Person;

public class Patient extends Person implements Diagnosable{

    String Diagnosis = "";
    /*
    change from void when all classes are ready
     */
    protected String getDiagnose(){
        return Diagnosis;
    }

    protected Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Patient" +
                "Diagnosis" + Diagnosis;
    }
    @Override
    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }
}
