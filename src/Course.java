public class Course {
    private String courseName;
    private String courseNumber;
    private String section;
    boolean marksAvailable;

    public Course(String name, String number, String section, boolean marksAvailable){
        courseName = name;
        courseNumber = number;
        this.section = section;
        this.marksAvailable = marksAvailable;
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

    public boolean isMarksAvailable() {
        return marksAvailable;
    }

    public void setMarksAvailable(boolean marksAvailable){
        this.marksAvailable = marksAvailable;
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
