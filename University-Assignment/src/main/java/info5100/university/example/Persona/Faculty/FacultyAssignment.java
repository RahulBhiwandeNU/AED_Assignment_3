/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    FacultyProfile facultyprofile;
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }
    
    public String getCourseTaught(){
        return courseoffer.getCourseNumber();
    }
    
    public int getRating(){
        return courseoffer.getRating();
    }
    
    public String getCourseName(){
        return courseoffer.getCourseName();
    }
}
