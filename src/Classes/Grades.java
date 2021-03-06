package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Grades {
    private static Grades instance = new Grades();
    private String rawText; //copy-pasted text from the SSC grades summary page
    private String degree; //short code for degree to distinguish within the copy-pasted raw text i.e. BSC, BA, etc.
    private HashMap courseInfo; //key is course name, value is grade.
//    private java.util.concurrent.Semaphore gradesHandled = new java.util.concurrent.Semaphore(1); //semaphore to wait until grades handled
    private ArrayList<Course> currentCourses; //list of current courses
    private HashMap<String, ArrayList<Course>> sessions; //HashMap of sessions, key is session, value is arrayList of courses

    //uses Singleton design pattern to only get one instance 
    private Grades(){  
    }

    //accessor for single instance of Singleton
    public static Grades getInstance(){
        return instance;    
    }
    
    //accessor for sessions
    public HashMap getSessions(){
        return sessions;
    }
    
    //sets rawText and degree to parameters, initializes courseInfo, currentCourses, sessions
    public void setFields(String rawText, String degree){
        this.rawText = rawText;
        this.degree = degree; 
        courseInfo = new HashMap<Course, Grade>(); 
        currentCourses = new ArrayList<Course>();
        sessions = new HashMap<String, ArrayList<Course>>();
    }
    
    //accessor for currentCourses
    public ArrayList<Course> getCurrent(){
        String[] courseNames = new String[currentCourses.size()];
        return currentCourses;
    }
    
    //accessor for courseInfo
    public HashMap<Course, Grade> getCourses(){
        return courseInfo;
    }
    
    //puts course into hash map
    public void putCourse(Course course, Grade grade){
        courseInfo.put(course, grade);
    }
    
    //removes course from hash map
    //NOTE: course will not have section or credits; empty fields
    public void removeCourse(Course course){
        for(Object known : courseInfo.keySet()){
            if(((Course) known).getCourseName().equals(course.getCourseName())
                    && ((Course) known).getCourseNumber().equals(course.getCourseNumber())){
                courseInfo.remove(known);
                break;
            }
        }
    }

    //REQUIRES: currentCourses has already been handled, and its grades/credits have been updated
    //returns the cumulative average of all courses, uses double to preserve decimal accuracy
    public double getCumulativeAverage(){
       //update grades of current courses in GUI
//       waitUntilDone();
        double totalMarks = 0.0;
        double totalCredits = 0.0;
        Grade currentGrade;
        for(Object course : courseInfo.keySet()){
            currentGrade = (Grade) courseInfo.get(course);
            //all marks and credits are known at this point
            totalMarks += currentGrade.getGrade() * currentGrade.getCredits();
            totalCredits += currentGrade.getCredits();
        }
        return totalMarks/totalCredits;
    }

    //REQUIRES: raw text from constructor
    //parses the raw text and places courses & respective grades in the hash map; course is key, grade is value
    //NOTE that courses with unavailable marks have their grades and credits in Grade object set to 0
    public void parseCoursesAndGrades(){    
        String fixedText =  rawText.replaceAll("\\s+", " ");
        String[] elements = fixedText.split(" "); //splits the text according to formatting
        String session = "";
        Course currentClass = null;
        Grade currentGrade;
        for(int i = 0; i < elements.length; i++){      
            //CASE 1: class mark currently available
            if(elements[i+7].equals(degree)){
                session = elements[i+5];
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], Double.parseDouble(elements[i+10]));
                currentGrade = new Grade (Double.parseDouble(elements[i+9]),Double.parseDouble(elements[i+3]));
                courseInfo.put(currentClass, currentGrade);
                i+= 10; //NOTE: 1 less than actual because of i++
                handleSessions(session, currentClass);
            }
            //CASE 2: class mark is unavailable and there is a term value
            else if(elements[i+5].equals(degree)){
                session = elements[i+3];
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], 0);
                currentCourses.add(currentClass);   
                currentGrade = new Grade (0, 0); //DEFAULT: 0% with 0 
                courseInfo.put(currentClass, currentGrade);
                i += 7; //NOTE: 1 less than actual because of i++
                handleSessions(session, currentClass);
            }
            //CASE 3: class mark is unavailable but there is no term value
            else if(elements[i+4].equals(degree)){
                session = elements[i+3];
                currentClass = new Course(elements[i], elements[i+1], elements[i+2], 0);
                currentCourses.add(currentClass);   
                currentGrade = new Grade (0, 0); //DEFAULT: 0% with 0 
                courseInfo.put(currentClass, currentGrade);
                i += 6; //NOTE: 1 less than actual because of i++
                handleSessions(session, currentClass);
            }
        }
    }
    
//      //helpers for handling from UI input
//    public void setDone(){
//        gradesHandled.release();
//    }
//    public void waitUntilDone(){
//        try {
//            gradesHandled.acquire();
//        } catch (InterruptedException ex) {
////            Logger.getLogger(Grades.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    private void handleSessions(String session, Course currentClass) {
        ArrayList<Course> curr;
        //if there is a course already associated with session, just add it to the list
            if(sessions.get(session) != null){
                curr = sessions.get(session);
                curr.add(currentClass);
                sessions.put(session, curr);
            }
            //otherwise if this is first course for this session, make new list and add
            else{
                ArrayList<Course> currentCoursesInSession = new ArrayList<Course>();
                currentCoursesInSession.add(currentClass);
                sessions.put(session, currentCoursesInSession);
            }
    }
}

   

 