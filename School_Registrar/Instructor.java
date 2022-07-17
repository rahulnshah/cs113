import java.io.Serializable;
public class Instructor  implements Serializable{
   private String instructorName;
   private int instructorId;
   private String department;
   
   public Instructor(String instructorName, int instructorId)
   {
      this.instructorName = instructorName;
      this.instructorId = instructorId;
   }
   
   public void setDepartment(String department)
   {
      this.department = department;
   }
   
   public String getDepartment()
   {
      return department;
   }
}