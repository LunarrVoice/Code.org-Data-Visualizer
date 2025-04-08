import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class SortingVisualizationRunner {
  public static void main(String[] args) {

    Scene sortingScene = new Scene();
    Scanner userInput = new Scanner(System.in);
    
    SortingAlgorithms sorting = new SortingAlgorithms();
    Visualization visualizer = new Visualization(sortingScene);
    Functions func = new Functions();

    String chosenAlgorithm;
    int chosenMax;
    int chosenLength;

    // Get input for which sorting algorithm to use
    boolean finished = false;
    while (!finished) {
      String[] algorithms = {"s", "i"};
      System.out.println("Enter: ");
      System.out.println(" - S for Selection Sort");
      System.out.println(" - I for Insertion Sort");

      String algorithm = userInput.next();

      for (String option : algorithms) {
        if (algorithm.toLowerCase().equals(option)) {
          chosenAlgorithm = option;
          finished = true;
          break;
        }
      }

      if (!finished) {
        System.out.println(algorithm + " is not a valid option, please enter a value listed.");
      }
    }

    // Get input for the max value of the list to be sorted
    System.out.println("Enter the max value for your list:");
    while (true) {
      try {
        int max = userInput.nextInt(); 
        
        if (max > 1) {
          chosenMax = max;
          break;
        }
        else {
          System.out.println("Please enter a value greater than 1.");
        }
      }
      catch (Exception e) {
        System.out.println("Please enter an integer.");
        userInput.next();
      }
    }

    // Get input for the amount of values in the list to be sorted
    System.out.println("Enter the length for your list:");
    while (true) {
      try {
        int length = userInput.nextInt(); 
        
        if (length > 1) {
          chosenLength = length;
          break;
        }
        else {
          System.out.println("Please enter a value greater than 1.");
        }
      }
      catch (Exception e) {
        System.out.println("Please enter an integer.");
        userInput.next();
      }
    }

    //test
    ArrayList<Integer> list = func.randomList(1, chosenMax, chosenLength);
    visualizer.drawIteration(list);

    /*fucking around
    for (int i = 0; i < 150; i++) {
      list = func.randomList(0, 100, 50);
      visualizer.drawIteration(list);
      sortingScene.pause(0.2);
    }*/

    Theater.playScenes(sortingScene);
    userInput.close();
    
  }
}
