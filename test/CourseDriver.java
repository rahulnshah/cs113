import school_registrar.Course;
import school_registrar.CourseException;
import school_registrar.Student;
import school_registrar.StudentException;

import java.util.Arrays;

public class CourseDriver
{
   public static void main(String [] args)
   {
      Course hist213 = new Course("Twentieth Century World History", 002);
      Course.outputTo("tmp/course1.ser", hist213);
      Course hist363;
      hist363 = Course.readFrom("tmp/course1.ser");
      if(hist363 != null)
      {
         System.out.println(hist363.getCourseName());
      }
      else
      {
         System.out.println("Course is unreferenced");
      }
      int idNum = 1;
      //run a for loop to add all the students, two students with same name can be added as long as their id differ
      try
      {
         hist213.addStudent(new Student("student23", 23));
         hist213.addStudent(new Student("student2", 2));
         hist213.addStudent(new Student("student12", 12));
         hist213.addStudent(new Student("student12", 12));
      }
      catch(CourseException | StudentException c)
      {
         System.out.println(c.getMessage());
      }
      
      try
      {
          //hist213.removeStudent(new Student("student" + 1,1));
          hist213.removeStudent(new Student("student" + 12,12));
      }
      catch(CourseException | StudentException c)
      {
         System.out.println(c.getMessage());
      }
      System.out.println(Arrays.toString(hist213.registeredStudents));
   }
}