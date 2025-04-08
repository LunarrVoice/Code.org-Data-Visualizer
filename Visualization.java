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
  }
  
}
