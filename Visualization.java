import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class Visualization {

  private Scene sortingScene;
  private Functions func = new Functions();

  public Visualization(){
    
  }

  public Visualization(Scene sortingScene) {
    this.sortingScene = sortingScene;
  }

  // Draws each element as a white bar with height based on the element's value
  // Called after each iteration of the sorting algorithm
  public void drawIteration(ArrayList<Integer> list) {
    sortingScene.clear("black");
    sortingScene.setFillColor("white");

    int rowWidth = (sortingScene.getWidth() / list.size());
    int rowHeight = (sortingScene.getHeight() / func.findMaxValue(list));

    for (int i = 0; i < list.size(); i++) {
      int x = rowWidth * i;
      int y = sortingScene.getHeight() - (rowHeight * list.get(i));
      int width = rowWidth;
      int height = sortingScene.getHeight() - y;

      sortingScene.drawRectangle(x, y, width, height);
    }

    sortingScene.pause(0.2);
  }

  // Adds an animation after the list is fully sorted
  public void finished(ArrayList<Integer> list) {
    int rowWidth = (sortingScene.getWidth() / list.size());
    int rowHeight = (sortingScene.getHeight() / func.findMaxValue(list));
    
    for (int i = 0; i < list.size(); i++) {
      sortingScene.setFillColor("gray");
      
      int x = rowWidth * i;
      int y = sortingScene.getHeight() - (rowHeight * list.get(i));
      int width = rowWidth;
      int height = sortingScene.getHeight() - y;

      sortingScene.drawRectangle(x, y, width, height);
      sortingScene.pause(0.01);
      sortingScene.setFillColor("white");
      sortingScene.drawRectangle(x, y, width, height);
    }

    for (int i = 0; i < list.size(); i++) {
      sortingScene.setFillColor("gray");
      
      int x = rowWidth * i;
      int y = sortingScene.getHeight() - (rowHeight * list.get(i));
      int width = rowWidth;
      int height = sortingScene.getHeight() - y;

      sortingScene.drawRectangle(x, y, width, height);
    }

    sortingScene.pause(0.3);

    for (int i = 0; i < list.size(); i++) {
      sortingScene.setFillColor("white");
      
      int x = rowWidth * i;
      int y = sortingScene.getHeight() - (rowHeight * list.get(i));
      int width = rowWidth;
      int height = sortingScene.getHeight() - y;

      sortingScene.drawRectangle(x, y, width, height);
    }
  }
    
}
