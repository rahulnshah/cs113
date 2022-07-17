/*
An Instructor class that minimally stores the following data fields for an instructor:Done
- name
- faculty id number
- department
The following methods should also be provided:
- A constructor that initializes the name and id fields
- Methods to set and retrieve the instructor’s department
*/
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