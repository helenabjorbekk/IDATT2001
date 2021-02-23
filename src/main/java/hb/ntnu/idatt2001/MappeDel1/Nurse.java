package hb.ntnu.idatt2001.MappeDel1;

import hb.ntnu.idatt2001.Employee;

public class Nurse extends Employee {

    public Nurse(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Nurse";
    }
}
