import java.io.Serializable;
public class Student implements Serializable
{
   private String name;
   private int studentId;
   private int credits;
   private int totalGradePoints;
   
   public Student(String name, int studentId)
   {
      this.name = name;
      this.studentId = studentId;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getStudentId()
   {
      return studentId;
   }
   
   public boolean equals(Student s)
   {
      return s.getStudentId() == studentId;
   }
   
   public void setCredits(int credits)
   {
      this.credits = credits;
   }
   
   public int getCredits()
   {
      return credits;
   } 
   
   public void setGradePoints(int totalGradePoints)
   {
      this.totalGradePoints = totalGradePoints;
   }  
   
   public int getGradePoints()
   {
      return totalGradePoints;
   }
   
   public double getGPA()
   {
      return (double) totalGradePoints / credits;
   }
}