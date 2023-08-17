package school_registrar;

import java.io.*;
public class Course implements Serializable{
   private String courseName;
   private int registrationCode;
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
      // binary search
      int left = 0;
      int right = numberOfStudents - 1;
      while(left <= right) {
         int mid = (left + right) / 2;
         if (studentId == registeredStudents[mid].getStudentId()) {
            return true;
         } else if (registeredStudents[mid].getStudentId() < studentId) {
            left = mid + 1;
         } else {
            right = mid - 1;
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
   public void addStudent(Student s) throws CourseException, StudentException {
      //when to search the student? well there has to be >= 1 student in the array for the search to go on.
      if(numberOfStudents >= maxStudents)
      {
         throw new CourseException(courseName + " is full.");
      }
      else if(numberOfStudents < 1 || !search(s.getStudentId()))
      {
         /* reorder the student's position so all
         students are in asc order by their id
          */
         registeredStudents[numberOfStudents] = s;
         int tempIndex = numberOfStudents;
         while(tempIndex > 0 && registeredStudents[tempIndex].getStudentId() < registeredStudents[tempIndex - 1].getStudentId())
         {
            // swap current student and previous student
            Student previousStudent = registeredStudents[tempIndex - 1];
            registeredStudents[tempIndex - 1] = registeredStudents[tempIndex];
            registeredStudents[tempIndex] = previousStudent;
            tempIndex--;
         }
         numberOfStudents++;
      }
      else
      {
         throw new StudentException(s.getName() + " is in the course.");
      }
   }
   /*- A method to remove a student from the course. If the student is not
found, then an exception with an appropriate message should be raised
(use the same exception class mentioned above).
*/
   public void removeStudent(Student s) throws CourseException, StudentException {
      if(numberOfStudents < 1)
      {
         throw new CourseException(courseName + " has no students.");
      }
      else if(!search(s.getStudentId()))
      {
         throw new StudentException(s.getName() + " is not in the course.");
      }
      else
      {
         int i;
         for(i = 0; i < numberOfStudents; i++)
         {
            if(registeredStudents[i].getStudentId() == s.getStudentId())
            {
               registeredStudents[i] = null;
               break; // no need to go further looking because id is unique
            }
         }
         while(i < (numberOfStudents - 1) && registeredStudents[i + 1] != null)
         {
            // swap current null student and next student
            Student nextStudent = registeredStudents[i + 1];
            registeredStudents[i + 1] = registeredStudents[i];
            registeredStudents[i] = nextStudent;
            i++;
         }
         numberOfStudents--;
      }
   }
   /*- A method that will allow Course objects to be output to a file using
object serialization
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
with Object serialization */
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
         System.out.println("Course class not found");
         c.printStackTrace();
      } 
      return course;
   } 
   public String getCourseName()
   {
      return courseName;
   } 
}
