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
import java.io.*;
public class Course implements Serializable{
   private String courseName;
   private int registrationCode;
   //private static final int maxStudents = 35;  
   private int maxStudents; 
   private Instructor instructor;
   private int numberOfStudents;
   private Student [] registeredStudents;
   
   public Course(String courseName, int registrationCode)
   {
      this.courseName = courseName;
      this.registrationCode = registrationCode;
      this.maxStudents = 35;
      this.registeredStudents = new Student[maxStudents];
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
   public boolean search(int studentId)
   {
      //binary search 
      for(Student s : registeredStudents)
      {
         if(studentId == s.getStudentId())
         {
            return true;
         }
      }
      return false;
   }
   /*- A method to add a student to the course. If the course is full, then an
exception with an appropriate message should be raised (try creating your
own exception class for this). Also, be sure that the student is not already
registered in the course. The list of students should be in the order that
they registered.
*/
   public void addStudent(Student s) throws CourseFullException
   {
      if(numberOfStudents >= maxStudents)
      {
         throw new CourseFullException(courseName + " is full.");
      }
      boolean isInCourse = search(s.getStudentId()); //pass the student's id number 
      if(!isInCourse)
      {
         //add the student 
         registeredStudents[numberOfStudents] = s;
         numberOfStudents++;
      }
      else
      {
         System.out.println(s.getName() + " is in the course.");
      }
   }
   /*- A method to remove a student from the course. If the student is not
found, then an exception with an appropriate message should be raised
(use the same exception class mentioned above).
*/
   public void removeStudent(Student s) throws CourseFullException
   {
      boolean isInCourse = search(s.getStudentId()); //pass the student's id number 
      if(!isInCourse)
      {
         throw new CourseFullException(s.getName() + " is not in " + courseName);
      }
      //else , remove him/her, search for their ID, because their ID is unique,  then set the reference of that 
      //index to null 
      for(int i = 0; i < maxStudents; i++)
      {
         if(registeredStudents[i].getStudentId() == s.getStudentId())
         {
            registeredStudents[i] = null;
            break; // no need to go further looking becasue id is unique
         }
      }
   }
   /*- A method that will allow Course objects to be output to a file using
object serializatio
*/
   public static void outputTo(String pathToFile, Course course)
   {
      try {
         FileOutputStream fileOut = new FileOutputStream(pathToFile);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(course);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in " + pathToFile);
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
   /*- A method that will allow Course objects to be read in from a file created
with Object serializtion*/
   public static Course readFrom(String pathToFile)
   {
      Course course = null;
      try {
         FileInputStream fileIn = new FileInputStream(pathToFile);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         course = (Course) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
      } 
      return course;
   } 
   public String getCourseName()
   {
      return courseName;
   } 
}