/*
A Student class that minimally stores the following data fields for a student: Done 
- name
- student id number
- number of credits
- total grade points earned

The following methods should also be provided:
- A constructor that initializes the name and id fields
- A method that returns the student name field
- A method that returns the student ID field
- A method that determines if two student objects are equal if their student
id numbers are the same (override equals from the class Object)
- Methods to set and retrieve the total number of credits
- Methods to set and retrieve the total number of grade points earned
- A method that returns the GPA (grade points divided by credits)
*/
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