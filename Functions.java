import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class Functions {

  public Functions() {
    
  }

  public ArrayList<Integer> randomList(int min, int max, int length) {
    ArrayList<Integer> list = new ArrayList<Integer>(length);

    int range = max - min;
    
    for (int i = 0; i < length; i++){
      list.add(min + (int) (Math.random() * range));
    }
    
    return list;
  }

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
