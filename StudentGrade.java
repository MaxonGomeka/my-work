/* BSC-COM-NE-12-18... 	The program prints user grade average and his/ her GPA*/
import java.util.Scanner;
public class StudentGrade{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter year of study:");
        int yearOfStudy = Integer.parseInt(input.nextLine());

          int numberOfcourses= 0;
          double average = 0;
          double sum = 0;
        if(yearOfStudy >=1 && yearOfStudy <=2){
        	numberOfcourses = 3;

       }else if (yearOfStudy >2 && yearOfStudy <=4) {
       	    numberOfcourses = 2;

       }else {
       	System.out.println("Your year of study " +yearOfStudy+ " is incorrect");
       	System.exit(1);
       }

         System.out.println("Enter " +numberOfcourses+ " courses" );


        String [] courses = new String [numberOfcourses];

      for(int i = 0; i<courses.length; i++){
      	System.out.println(" Enter course name for course " +(i+1)+ " ");
      	courses[i]= input.nextLine();


      } double [] grades =  new double[numberOfcourses];
      	for(int y = 0; y<grades.length; y++){
      	System.out.println(" Enter grade for " +courses[y]);
      	grades[y]=input.nextDouble();


      	sum+= grades[y];
      	 average =sum/numberOfcourses;

}

if(average<50){
      System.out.printf("\n"+name+ " these "+numberOfcourses+ " courses you have entered yield an average of  %4.2f and GPA 0",average);
}else if(average >=50 && average <=60){
      System.out.printf("\n"+name+ " these "+numberOfcourses+ " courses you have entered yield an average of  %4.2f and GPA 2",average);
}else if(average >=61 && average <=70 ){
	  System.out.printf("\n"+name+ " these "+numberOfcourses+ " courses you have entered yield an average of   %4.2f and GPA 3",average);

}else if(average >=71 && average <=80 ){
	  System.out.printf("\n"+name+ " these "+numberOfcourses+ " courses you have entered yield an average of  %4.2f and GPA 4",average);

}else if(average >=81 && average <=100 ){
	  System.out.printf("\n"+name+ " these "+numberOfcourses+ " courses you have entered yield an average of  %4.2 and GPA 5",average);

}
 else{
    System.out.println("Number of courses you have entered are not correct");
  }


   	}


}
