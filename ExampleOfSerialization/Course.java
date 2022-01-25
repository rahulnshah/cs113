/*
A Course class that minimally stores the following data for a course:
- name of the course
- course registration code
- maximum number of 35 students ?<--------------
- instructor
- number of students
- students registered in the course (an array)
The following methods should also be provided:
- A constructor that initializes the name, registration code, and maximum
number of students
- Methods to set and retrieve the instructor
*/

public class Course{
   private String courseName;
   private int registrationCode;
   // set max # of studs to 35, probably good to store it in a static constant of type int 
   private Instructor instructor;
   private int numberOfStudents;
   private Student [] registeredStudents;
   
   public Course(String courseName, int registrationCode, int numberOfStudents)
   {
      this.courseName = courseName;
      this.registrationCode = registrationCode;
      this.numberOfStudents = numberOfStudents;
      // if numberOfStudents <= 35, set the registeredStudents array else, throw an error or message to the screen.
   }
   
   public void setInstructor(Instructor instructor)
   {
      this.instructor = instructor;
   }  
   
   public Instructor getInstructor()
   {
      return instructor;
   }
   /*- A method to search for a student in the course; the search should be
based on an ID number.*/
   public void search()
   {
   
   }
   /*- A method to add a student to the course. If the course is full, then an
exception with an appropriate message should be raised (try creating your
own exception class for this). Also, be sure that the student is not already
registered in the course. The list of students should be in the order that
they registered.
*/
   public void addStudent()
   {
   
   }
   /*- A method to remove a student from the course. If the student is not
found, then an exception with an appropriate message should be raised
(use the same exception class mentioned above).
*/
   public void removeStudent()
   {
   
   }
   /*- A method that will allow Course objects to be output to a file using
object serializatio
*/
   public void outputTo()
   {
   
   }
   /*- A method that will allow Course objects to be read in from a file created
with Object serializtion*/
   public void readFrom()
   {
      
   }  
}