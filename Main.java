import java.util.Scanner;
/**
 * program that finds average among heights
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask the user how many heights they want
    System.out.println("How many heights would you like to enter");
    int height = input.nextInt();
    double heights[] = new double[height];

    System.out.println("Please enter the heights on seperate lines");

    // get the heights from the user and store them in an array
    for (int i = 0; i < heights.length; i++){
      heights[i] = input.nextDouble();
    }
    
    // create sum for running total of heights
    double sum = 0;

    // add all the heights into sum
    for (int i = 0; i < heights.length; i++){
      sum += heights[i];
    }

    // determine the average and then tell the user
    double average = sum/heights.length;
    System.out.println("The average height is " + average + " cm");

    // determine heights above average
    System.out.println("The heights above average are");
    for (int i = 0; i < heights.length; i++){
      if (heights[i] > average){
        System.out.println(heights[i]);

      }else if (i <= average){

      }
    }
  }
}
