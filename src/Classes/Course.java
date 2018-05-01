package Classes;

public class Course {
    private String courseName;
    private String courseNumber;
    private String section;

    public Course(String name, String number, String section){
        courseName = name;
        courseNumber = number;
        this.section = section;
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
