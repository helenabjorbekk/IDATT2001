package hb.ntnu.idatt2001;

import java.util.HashMap;
import java.util.Iterator;

public class Hospital<Department> {

    private final String hospitalName;
    private final HashMap<String, Department> departments;

    public Hospital(String hospitalName, HashMap<String, Department> departments){
        this.hospitalName = hospitalName;
        departments = new HashMap<>();
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public Iterator<Department> getGetDepartments() {
        return departments.values().iterator();
    }


}
