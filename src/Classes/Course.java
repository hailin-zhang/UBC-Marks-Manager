package Classes;

public class Course {
    private String courseName;
    private String courseNumber;
    private String section;
    private double sectionAverage;

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
