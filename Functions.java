import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class Functions {

  public Functions() {
    
  }

  // Creates an unsorted list with random values
  public ArrayList<Integer> randomList(int min, int max, int length) {
    ArrayList<Integer> list = new ArrayList<Integer>(length);

    int range = max - min;
    
    for (int i = 0; i < length; i++){
      list.add(min + (int) (Math.random() * range));
    }
    
    return list;
  }

  // Creates an unsorted list of values counting up
  public ArrayList<Integer> randomListEqualSteps(int length) {
    ArrayList<Integer> list = new ArrayList<Integer>(length);

    for (int i = 0; i < length; i++) {
      list.add(i + 1);
    }

    return randomizeList(list);
  }

  // Randomizes a sorted list
  public ArrayList<Integer> randomizeList(ArrayList<Integer> list) {
    ArrayList<Integer> randomizedList = new ArrayList<Integer>(list.size());
    
    int iterations = list.size();
    for (int i = 0; i < iterations; i++) {
      int randomIndex = (int) (Math.random() * list.size());
      randomizedList.add(list.get(randomIndex));
      list.remove(randomIndex);
    }

    return randomizedList;
  }

  // Finds the maximum value in a list
  public int findMaxValue(ArrayList<Integer> list) {
    int max = Integer.MIN_VALUE;

    for (int num : list) {
      if (num > max) {
        max = num;
      }
    }

    return max;
  }
  
}
