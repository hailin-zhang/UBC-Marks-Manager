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
    
    private Grades testKnown;
    private Grades testUnknown;
    private String knownCourses;
    private String unknownCourses;
    
    public GradesTest() {
    }
   
    @Before
    public void setUp() {
        knownCourses = "CPSC 221 202 86 A 2017W 2 BSC 2 4.0 78 CPSC 213 204 84 A- 2017W 2 BSC 2 4.0 73 ";
        unknownCourses = "CPSC 304 911 2018S 1 BSC 2 0 CPSC 322 911 2018S 1 BSC 2 0 CPSC 313 9W1 2018S 2 BSC 2 0 CPSC 320 9W1 2018S 2 BSC 2 0";
        testKnown = new Grades(knownCourses, "bSc");
        testUnknown = new Grades(unknownCourses, "BSC");
    }

    /**
     * Test of getCumulativeAverage method, of class Grades.
     */
    @Test
    public void testCumulativeAverageKnown(){
        testKnown.parseCoursesAndGrades();
        assertTrue((double)((86*4+84*4)/(4+4)) == testKnown.getCumulativeAverage());
    }

    /**
     * Test of getCourses method, of class Grades.
     */
    @Test
    public void testGetCourses() {
     
    }

    /**
     * Test of parseCoursesAndGrades method, of class Grades.
     */
    @Test
    public void testParseCoursesAndGrades() throws Exception {
       
    }
    
}
