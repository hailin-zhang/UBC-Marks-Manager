import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class Grades {
    private String rawText; //copy-pasted text from the SSC grades summary page
    private String degree; //short code for degree to distinguish within the copy-pasted raw text i.e. BSC, BA, etc.
    private HashMap courseInfo; //key is course name, value is grade. Will be set to -1 if grade is not available.

    //constructor requires copy-pasted text from SSC and short code for user's degree
    public Grades(String rawText, String degree){
        this.rawText = rawText;
        courseInfo = new HashMap<Course, Grade>();
        this.degree = degree; //TODO: user must input their degree in the program!!!!
    }

    //returns the cumulative average of all courses, uses double to preserve decimal accuracy
    public double getCumulativeAverage(){
        double totalMarks = 0.0;
        double totalCredits = 0.0;
        Grade currentGrade;
        for(Object course : courseInfo.keySet()){
            currentGrade = (Grade) courseInfo.get(course);
            totalMarks += currentGrade.getGrade();
            totalCredits += currentGrade.getCredits();
        }
        return totalMarks/totalCredits;
    }

    //returns a single string (no new lines) of the form NAME NUMBER SECTION, NAME ...
    public String getCourses(){
        String courseList = "";
        for(Object course : courseInfo.keySet()){
             courseList += ((Course)course).getClass() + " "
                     + ((Course)course).getCourseNumber() + " "
                     +((Course)course).getSection() + ", ";
        }
        return courseList;
    }

    //parses the raw text and places courses & respective grades in the hash map; course is key, grade is value
    //NOTE that courses with unavailable marks have their grade field of Grade object set to -1
    public void parseCoursesAndGrades(String rawText){
        String[] elements = rawText.split(" "); //splits the text according to spaces.
        Course currentClass;
        Grade currentGrade;
        for(int i = 0; i < elements.length; i++){
            //CASE 1: class mark currently unavailable
            if(elements[i+5].equals(degree)){
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], false);
                currentGrade = new Grade(getCredits(currentClass), -1); //dummy grade, unavailable
                courseInfo.put(currentClass, currentGrade);
                i += 8;
            }
            //CASE 2: class mark is available
            else{
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], true);
                currentGrade = new Grade (Integer.parseInt(elements[i+9]),Integer.parseInt(elements[i+3]));
                courseInfo.put(currentClass, currentGrade);
                i+= 11;
            }
        }
    }

    //private helper for when marks are unavailable
    //will be called only when marks are unavailable; goes to UBC courses site and gets the credits for a course.
    //COULD have just skipped this (user input themselves) but if the users are as lazy as me they will thank me for this
    private int getCredits(Course currentClass) {
        try {
            URL courseSite = new URL("https://courses.students.ubc.ca/cs/main?&dept=" + currentClass.getCourseName() + "&course=" + currentClass.getCourseNumber());
        } catch (MalformedURLException e) {
            //error message in netbeans
        }
        //todo: go to the url and get the credits.
        return 0;
    }
}

