public class Student1{
    private String name;
    private double [] grades;
    private int totalNumberOfStudent=1;

    public Student1(){
    
    }
    public  void setName(String name){
      this.name = name;
    }
    public String getName(){
      return this.name;
    }
    public void setGrades(double []grades){
      this.grades= grades;
    }
    public double [] getGrades(){
      return this.grades;
    }
   public  void getNumberOfStudent(){
     this.totalNumberOfStudent++;
   }
   public double getAverageGrade(){
     double average = 0;
     double sum = 0;
     for (int i = 0; i<=grades.length-1;i++) {
       sum += grades[i];
       average =  sum/grades.length;

     }return average;
   }
   public String getPrintStudentDetails(){
     String m = "Student name is "+getName()+ " average grade is "+getAverageGrade()+ " and the current number of students is  "+this.totalNumberOfStudent;
     return  m;
   }






















}
