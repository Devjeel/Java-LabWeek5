
package assignment1;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Jeel Hitesh Patel
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String postalCode;
    private LocalDate dateOfBirth;
    private LocalDate dateEnrolled;
    private int studentNum;
    boolean goodStanding;

    public Student(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate DOBOfStudent, LocalDate DateOfEnroll, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setDateOfBirth(DOBOfStudent);
        setDateEnrolled(DateOfEnroll);
        setStudentNum(studentNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.isEmpty())
            this.firstName = firstName;
        else 
            throw new IllegalArgumentException("first name cannot be empty!");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.isEmpty())
            this.lastName = lastName;
        else 
            throw new IllegalArgumentException("last name cannot be empty!");
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if(!streetAddress.isEmpty())
            this.streetAddress = streetAddress;
        else 
            throw new IllegalArgumentException("Street Address cannot be empty!");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(!city.isEmpty())
            this.city = city;
        else 
            throw new IllegalArgumentException("City cannot be empty!");
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        if(!postalCode.isEmpty())
            this.postalCode = postalCode;
        else 
            throw new IllegalArgumentException("Postal code cannot be empty!");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(LocalDate dateEnrolled) {
        if(LocalDate.now().isAfter(dateEnrolled))
            this.dateEnrolled = dateEnrolled;
        else 
            throw new IllegalArgumentException("Date of enrolled must be less than today!");
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if(studentNum > 0 )
            this.studentNum = studentNum;
        else 
            throw new IllegalArgumentException("Student number must be grater than zero!");               
    }
    
    public int getYearBorn()
    {
        return dateOfBirth.getYear();
    }
    
    public int getYearEnrolled()
    {
        return dateEnrolled.getYear();
    }
    
    public void suspendStudent() 
    {
        goodStanding = false;
    }
    
    public void reinstateStudent()
    {
        goodStanding = true;
    }
        
    public boolean isInGoodStanding()
    {
        return goodStanding;
    }
    
    public int getAge()
    {
        int age = Period.between(dateOfBirth, dateEnrolled).getYears();
        return age;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth) {
        //if(getAge() < 100 )
            this.dateOfBirth = dateOfBirth;
        //else
            //throw new IllegalArgumentException("Date of birth must be less than 100 and grater than 0 !");
    }
    
    @Override 
    public String toString()
    {
        return String.format("%s %s, student number: %d", firstName, lastName, studentNum);
    }
}

