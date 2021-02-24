package hb.ntnu.idatt2001;

import java.util.HashMap;
import java.util.Iterator;

public class Hospital<Department> {

    /*
    declaring variables
     */
    private final String hospitalName;
    private final HashMap<String, Department> departments;

    public Hospital(String hospitalName, HashMap<String, Department> departments){
        this.hospitalName = hospitalName;
        //departments = new HashMap<>();
        this.departments = new HashMap<>();
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public Iterator<Department> getDepartments() {
        return departments.values().iterator();
    }

    public Department getDepartment(String hospitalName){
        return departments.get(hospitalName);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName +
                "departments=" + departments;
    }
}
