package project;

/**
 * Saves a scholarship along with value and notes.
 * 
 * @author Saul Diosdado
 */
public class Scholarship implements java.io.Serializable {
    
    private String name;
    private String value, sponsor;
    private String notes;
    private boolean monetary;
    
    private boolean requirements;
    private String ethnicity;
    private String gender;
    private String gpa;
    
    public Scholarship() {}
    
    public Scholarship(String name) {
        this.name = name;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Basic Info Getters and Setters ">
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public boolean isMonetary() {
        return monetary;
    }
    
    public void setMonetary(boolean monetary) {
        this.monetary = monetary;
    }
    
    public boolean hasRequirements() {
        return requirements;
    }
    
    public void setRequirements(boolean requirements) {
        this.requirements = requirements;
    }
    
    public String getEthnicity() {
        return ethnicity;
    }
    
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGPA() {
        return gpa;
    }
    
    public void setGPA(String gpa) {
        this.gpa = gpa;
    }
    // </editor-fold>
    
}
