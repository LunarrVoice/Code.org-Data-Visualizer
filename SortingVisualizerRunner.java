import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class SortingVisualizationRunner {
  public static void main(String[] args) {

    Scene sortingScene = new Scene();
    Scanner userInput = new Scanner(System.in);
    
    Visualization visualizer = new Visualization(sortingScene);
    SortingAlgorithms sorting = new SortingAlgorithms(visualizer);
    Functions func = new Functions();

    String chosenAlgorithm = "";
    int chosenLength = 0;

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

    if (chosenAlgorithm.equals("s")) {
      ArrayList<Integer> list = func.randomListEqualSteps(chosenLength);
      sorting.selectionSort(list);
    }
    else if (chosenAlgorithm.equals("i")) {
      ArrayList<Integer> list = func.randomListEqualSteps(chosenLength);
      sorting.insertionSort(list);
    }

    Theater.playScenes(sortingScene);
    userInput.close();
    
  }
}
