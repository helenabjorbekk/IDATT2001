package hb.ntnu.idatt2001.MappeDel1;
import hb.ntnu.idatt2001.Employee;
import hb.ntnu.idatt2001.Person;

import java.util.HashMap;

public class Department {

    public String departmentName;
    private final HashMap<String, Employee> employees;
    private final HashMap<String, Patient> patients;

    public Department(String departmentName, HashMap<String, Employee> employees, HashMap<String, Patient> patients){
        this.departmentName = departmentName;
        this.employees = new HashMap<>();
        this.patients = new HashMap<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee e){
        this.employees.put(e.getSocialSecurityNumber(), e);
    }

    public HashMap<String, Patient> getPatients() {
        return patients;
    }
    /*
    public void addPatient (Patient p)

        throws DuplicateException{
        if()*/

    public void addPatient(Patient p){
        if(patients.containsKey(p.getSocialSecurityNumber())){
            throw new IllegalArgumentException("Patient already exists");
        }
        patients.put(p.getSocialSecurityNumber(), p);



    /*
    public boolean addPatient(Patient p){
        if(patients.get(p.getSocialSecurityNumber()) == null) {
            patients.put(p.getSocialSecurityNumber(), p);
            return true;
        }
        return false;
     */
    }
    public void remove(Person person) throws RemoveException{
        this.
    }

    /*
            Double check if this is right
             */
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Department)) return false;
        Department department = (Department) obj;
        return this.getDepartmentName().equals(department.getDepartmentName());
    }

    @Override
    public String toString() {
        return "Department" +
                "departmentName" + departmentName +
                "employees=" + employees +
                "patients=" + patients;
    }
}
