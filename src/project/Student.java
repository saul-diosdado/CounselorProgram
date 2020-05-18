package project;

import java.util.ArrayList;

/**
 * Student class used for every student in the database.
 * 
 * @author Saul Diosdado
 */
public class Student implements java.io.Serializable {
    
    // Basic information of the student
    private String firstName, lastName;
    private String gender;
    private String grade;
    private String idNumber;
    private String emailAddress, phoneNumber;
    private String gpa;
    private String ethnicity, notes;
    private String formattedNumber;
    
    // ArrayList of the colleges.
    private ArrayList<String> colleges = new ArrayList<String>();
    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Basic Info Getters and Setters">
    @Override
    public String toString() {
        return this.getName() + " " + idNumber;
    }

    /**
     * Returns the student's first and last name.
     * @return firstName and lastName
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the student's first name.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the student's first name and updates the student's components.
     * @param firstName the student's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Returns the student's last name.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the student's last name and updates the student's components.
     * @param lastName the student's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * The student's gender.
     * @return Male or female.
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Sets the student's gender.
     * @param gender the male or female value.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * Returns the grade level of the student.
     * @return the grade level of the student.
     */
    public String getGrade() {
        return grade;
    }
    
    /**
     * Sets the grade level of the student.
     * @param grade grade level.
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Returns the student's ID number.
     * @return idNumber
     */
    public String getID() {
        return idNumber;
    }

    /**
     * Sets the student's ID number.
     * @param idNumber the student's ID number.
     */
    public void setID(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Returns the student's email address.
     * @return emailAddress
     */
    public String getEmail() {
        return emailAddress;
    }

    /**
     * Sets the student's email address.
     * @param emailAddress the student's email address.
     */
    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the student's phone number.
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the students phone number and updates the formatted number.
     * @param phoneNumber the student's phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null) {
            setFormattedNumber(phoneNumber);
        } else {
            this.formattedNumber = null;
        }
        this.phoneNumber = phoneNumber;
    }
    
    private void setFormattedNumber(String phoneNumber) {
        StringBuilder formattedNumber = new StringBuilder();
        formattedNumber.append("(").append(phoneNumber.substring(0, 3)).append(")");
        formattedNumber.append("-").append(phoneNumber.substring(3, 6));
        formattedNumber.append("-").append(phoneNumber.substring(6, 10));
        this.formattedNumber = formattedNumber.toString();
    }
    
    /**
     * Returns the formatted phone number of the student.
     * @return formattedNumber
     */
    public String getFormattedNumber() {
        return formattedNumber;
    }
    
    /**
     * Returns the student's GPA.
     * @return gpa
     */
    public String getGPA() {
        return gpa;
    }
    
    /**
     * Sets the student's gpa.
     * @param gpa the gpa of the student.
     */
    public void setGPA(String gpa) {
        this.gpa = gpa;
    }
    
    /**
     * Returns the student's ethnicity.
     * @return ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }
    
    /**
     * Sets the student's ethnicity.
     * @param ethnicity the student's ethnicity.
     */
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    
    /**
     * Returns the notes on the student.
     * @return notes
     */
    public String getNotes() {
        return notes;
    }
    
    /**
     * Sets the student's notes.
     * @param notes the notes written on the student.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    // </editor-fold>  
    
    /**
     * Returns a string of the college name of the student at an index.
     * @param index the index of the college.
     * @return String of the college name.
     */
    public String getCollege(int index) {
        return colleges.get(index);
    }
    
    /**
     * Adds a college to the student and updates the student's checklist.
     * @param college the college the student has added.
     */
    public void addCollege(String college) {
        colleges.add(college);
    }
    
    /**
     * Removes a college from the student's list of colleges when given the
     * college. Also updates the student's checklist and throws a pop up message
     * if the college was not found in the student's list.
     * @param college the college to be removed from the list.
     */
    public void removeCollege(String college) {
        colleges.remove(college);
    }
    
    public int getCollegeSize() {
        return colleges.size();
    }
    
}
