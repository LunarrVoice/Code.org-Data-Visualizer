import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class SortingAlgorithms {

  private Visualization visualizer;

  public SortingAlgorithms() {
    
  }

  public SortingAlgorithms(Visualization visualizer) {
    this.visualizer = visualizer;
  }

  // Swaps the place of two elements in a list
  public void swap(ArrayList<Integer> list, int originalElementIndex, int newElementIndex) {
    int originalElement = list.get(originalElementIndex);
    list.set(originalElementIndex, list.get(newElementIndex));
    list.set(newElementIndex, originalElement);
  }

  public void move(ArrayList<Integer> list, int oldIndex, int newIndex) {
    int element = list.get(oldIndex);
    list.remove(oldIndex);
    list.add(newIndex, element);
  }

  // -- Sorting Algorithms -- //
  
  public void selectionSort(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int minIndex = i;
        
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(minIndex) > list.get(j)) {
          minIndex = j;
        }
      }

      swap(list, i, minIndex);
      visualizer.drawIteration(list);
    }

    visualizer.finished(list);
  }

  public void insertionSort(ArrayList<Integer> list) {
    for (int i = 1; i < list.size(); i++) {
      for (int j = i; j > 0; j--) {
        if (list.get(i) > list.get(j - 1)) {
          move(list, i, j);
          break;
        }
        else if (j == 1) {
          move(list, i, 0);
          break;
        }
      }

      visualizer.drawIteration(list);
    }

    visualizer.finished(list);
  }
  
}
