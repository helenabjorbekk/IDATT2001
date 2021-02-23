package hb.ntnu.idatt2001;

import java.util.HashMap;
import java.util.Iterator;

public class Hospital<Department> {

    private final String hospitalName;

    public Hospital (String hospitalName){
        this.hospitalName=hospitalName;
        HashMap<String, Department> departments = new HashMap<>();
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public Iterator<Department> getGetDepartments() {
        return getDepartments;
    }


}
