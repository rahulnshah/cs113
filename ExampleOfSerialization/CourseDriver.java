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
   }
}