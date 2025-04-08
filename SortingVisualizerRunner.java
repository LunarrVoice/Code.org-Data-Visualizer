import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class SortingVisualizationRunner {
  public static void main(String[] args) {

    Scene sortingScene = new Scene();
    
    SortingAlgorithms sorting = new SortingAlgorithms();
    Visualization visualizer = new Visualization(sortingScene);
    Functions func = new Functions();

    //test
    ArrayList<Integer> list = func.randomList(0, 100, 50);
    visualizer.drawIteration(list);

    //fucking around
    for (int i = 0; i < 150; i++) {
      list = func.randomList(0, 100, 50);
      visualizer.drawIteration(list);
      sortingScene.pause(0.2);
    }

    Theater.playScenes(sortingScene);
    
  }
}
