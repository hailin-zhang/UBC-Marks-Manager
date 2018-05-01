package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
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
            //if marks are available, add, otherwise don't do anything with the mark
            if(((Course) course).isMarksAvailable()){
                totalMarks += currentGrade.getGrade() * currentGrade.getCredits();
            }
            totalCredits += currentGrade.getCredits();
        }
        return totalMarks/totalCredits;
    }

//    public double getAverage(   )

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

    //REQUIRES: raw text from constructor
    //parses the raw text and places courses & respective grades in the hash map; course is key, grade is value
    //NOTE that courses with unavailable marks have their grade field of Grade object set to -1
    public void parseCoursesAndGrades() throws IOException{
        String[] elements = rawText.split(" "); //splits the text according to spaces.
        Course currentClass;
        Grade currentGrade;
        for(int i = 0; i < elements.length; i++){
            //CASE 1: class mark currently unavailable
            if(elements[+5].equals(degree)){ //TODO: implement a box that selects BSC, BA, etc. so do not use ignore case
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], false);
                currentGrade = new Grade(getCredits(currentClass), -1); //dummy grade, unavailable
                courseInfo.put(currentClass, currentGrade);
                i += 7; //NOTE: 1 less than actual because of i++
            }
            //CASE 2: class mark is available
            else{
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], true);
                currentGrade = new Grade (Double.parseDouble(elements[i+9]),Double.parseDouble(elements[i+3]));
                courseInfo.put(currentClass, currentGrade);
                i+= 10; //NOTE: 1 less than actual because of i++
            }
        }
    }

    //private helper for when marks are unavailable
    //will be called only when marks are unavailable; goes to UBC courses site and gets the credits for a course.
    //COULD have just skipped this (user input themselves) but if the users are as lazy as me they will thank me for this
    private int getCredits(Course currentClass) throws IOException {
            URL courseSite = new URL("https://courses.students.ubc.ca/cs/main?pname=subjarea&tname=subjareas&req=3&dept="
                    + currentClass.getCourseName()
                    + "&course=" + currentClass.getCourseNumber());
            URLConnection connection = courseSite.openConnection();
            InputStream stream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

            
            //close connections
            stream.close();
            reader.close();

        //todo: go to the url and get the credits.

        return 0;
    }
}

