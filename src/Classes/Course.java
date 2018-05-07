package Classes;

import java.util.Objects;

public class Course {
    private String courseName;
    private String courseNumber;
    private String section;
    private double sectionAverage;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.courseName);
        hash = 59 * hash + Objects.hashCode(this.courseNumber);
        return hash;
    }

    //IMPORTANT: overrided equals; courses are the asme curse if they have same name and number (i.e. CPSC 221 section 1 
    // == CPSC 221 section 2)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseName, other.courseName)) {
            return false;
        }
        if (!Objects.equals(this.courseNumber, other.courseNumber)) {
            return false;
        }
        return true;
    }

    public Course(String name, String number, String section, double avg){
        courseName = name;
        courseNumber = number;
        this.section = section;
        sectionAverage = avg;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getSection() {
        return section;
    }
    
    public double getSectionAverage(){
        return sectionAverage;
    }

    public void setSectionAverage(double avg){
        sectionAverage = avg;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
