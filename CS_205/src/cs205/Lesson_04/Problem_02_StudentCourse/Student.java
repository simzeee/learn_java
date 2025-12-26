package cs205.Lesson_04.Problem_02_StudentCourse;

public class Student implements Comparable<Student> {
   String firstName;
   String lastName;
   double GPA;

   public Student(String firstName, String lastName, double GPA){
      this.firstName = firstName;
      this.lastName = lastName;
      this.GPA = GPA;
   }

   @Override
   public int compareTo(Student otherStudent){
      int byGPA = Double.compare(otherStudent.GPA, this.GPA);
      if(byGPA != 0){
         return byGPA;
      }
      int byLastName = this.lastName.compareTo(otherStudent.lastName);

      if(byLastName != 0){
         return byLastName;
      }

      int byFirstName = this.firstName.compareTo(otherStudent.firstName);

      if(byFirstName != 0){
         return byFirstName;
      }

      return 0;      
   }
// - return a string representation of a student in the format "GPA lastName, firstName"
   public String toString(){
      String myStr = "%.2f %s, %s";
      String result = String.format(myStr, this.GPA, this.lastName, this.firstName);
      return result;
   }
}
