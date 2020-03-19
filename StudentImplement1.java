import  java.util.Scanner;
public  class StudentImplement1{
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your name:");
     String name = input.nextLine();

     double [] grades = new double[3];
     for (int i =0;i<=grades.length-1;i++ ) {
       System.out.println("Enter your grade:"+(i+1));
       grades[i] = input.nextDouble();

     }
     Student1 student2 = new Student1();
     student2.setName(name);
     student2.setGrades(grades);
     student2.getNumberOfStudent();

     System.out.println(student2.getPrintStudentDetails());

















     }

}
