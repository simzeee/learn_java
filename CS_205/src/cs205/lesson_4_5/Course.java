public class Course implements Comparable<Course> {
   private String department;
   private Integer number;

    public Course(String dept, Integer num) {
        this.department = dept;
        this.number = num;
    }
    
   // to enable sorting of Course objects, return -1, 0, or 1 according to the comparisons of the 
   // private members between Course and otherCourse. 
   // Precedence of comparisons: department (lowest first), then number (lowest first)

    @Override
    public int compareTo(Course otherCourse){

       int byDept = this.department.compareTo(otherCourse.department);
        if (byDept != 0) {
            return byDept;
        }
        // 2) then number
        return this.number.compareTo(otherCourse.number);
    }

    @Override
    public String toString(){
      return department + " " + number;
    }

}