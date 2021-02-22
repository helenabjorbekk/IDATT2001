package hb.ntnu.idatt2001;

 abstract class Person {

    String firstName;
    String lastName;
    String socialSecurityNumber;

     public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getSocialSecurityNumber() {
         return socialSecurityNumber;
     }

     public void setSocialSecurityNumber(String socialSecurityNumber) {
         this.socialSecurityNumber = socialSecurityNumber;
     }
     public String getFullName(){
         return firstName + lastName;
     }

     @Override
     public String toString() {
         return "Person" +
                 "First name: " + firstName + "\n" +
                 "Last name: " + lastName + "\n" +
                 "Social securitynumber: " + (firstName + lastName) + "\n" + "Full name: " + getFullName();
     }
 }
