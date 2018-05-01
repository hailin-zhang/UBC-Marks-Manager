/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hailin
 */
public class GradesTest {
    
    private Grades testCourse;
    private String courses;
    
    public GradesTest() {
    }
   
    @Before
    public void setUp() {
        courses = "CPSC 304 911 2018S 1 BSC 2 0 CPSC 322 911 2019S "
                + "1 BSC 2 0 CPSC 313 9W1 2020S 2 BSC 2 0 CPSC 320 9W1 "
                + "2021S 2 BSC 2 0 CPSC 221 202 86 A 2017W 2 BSC 2 4.0 78 CPSC"
                + " 213 204 84 A- 2017W 2 BSC 2 4.0 74";
        testCourse = Grades.getInstance();
        testCourse.setFields(courses, "BSC");
    }

    /**
     * Test of getCumulativeAverage method, of class Grades.
     */
    @Test
    public void testCumulativeAverage(){
        testCourse.parseCoursesAndGrades();
        assertTrue((double)((86*4+84*4+4*(50*3))/(4*3+4+4)) == testCourse.getCumulativeAverage());
    }
    
     @Test
    public void testGetCurrent(){
        testCourse.parseCoursesAndGrades();
        testCourse.getCurrent();
    }

//    /**
//     * Test of getCourses method, of class Grades.
//     */
//    @Test
//    public void testGetCourses() {
//     
//    }
//
//    /**
//     * Test of parseCoursesAndGrades method, of class Grades.
//     */
//    @Test
//    public void testParseCoursesAndGrades() throws Exception {
//       
//    }
    
}
