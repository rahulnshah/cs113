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
      //linear search 
      for(int i = 0; i < numberOfStudents; i++)
      {
         if(registeredStudents[i] != null && studentId == registeredStudents[i].getStudentId())
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
      //when to search the student? well there has to be >= 1 stduent in the array for the search to go on.
      if(numberOfStudents >= maxStudents)
      {
         throw new CourseFullException(courseName + " is full.");
      }
      else if(numberOfStudents < 1)
      {
         //add the student 
         registeredStudents[numberOfStudents] = s;
         numberOfStudents++;
      }
      else
      {
      
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
