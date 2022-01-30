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
      //run a for loop to add all of the students, two students with same name can be added as long as their id differ 
      try
      {
         for(int i = 0; i < 35; i++)
         {
            hist213.addStudent(new Student("student" + idNum, idNum));
            idNum++;
         }
         //exception thrown 
         hist213.addStudent(new Student("student" + idNum, idNum + 1));
      }
      catch(CourseFullException c)
      {
         System.out.println(c.getMessage());
      }
      
      try
      {
          hist213.removeStudent(new Student("student" + 1,1));
          //exception thrown 
          hist213.removeStudent(new Student("student" + 1,1));
          hist213.removeStudent(new Student("student" + 68,68));
      }
      catch(CourseFullException c)
      {
         System.out.println(c.getMessage());
      }
   }
}