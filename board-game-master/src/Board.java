import java.awt.Point;
import java.util.HashMap;

public class Board {  
  private int finishPos;
  private HashMap<Integer, Integer> tunnels = new HashMap<>();

  public Board(int finishPos) {
    this.finishPos = finishPos;
    prepareTunnels();
  }

  public int getFinishPos() {
    return finishPos;
  }

  public Integer getTunnelOutPos(int pos){
    return tunnels.get(pos);
  }

  public Point getRefLocationForPos(int pos){
    //800*500
    int row = ((pos - 1) / 10);
    int x;    
    if(row % 2 == 1){
      x = 82 * ((pos - 1) % 10);
    }else{
      x = 820 - ((pos - (row * 10)) * 82);
    }
    return new Point(x,  448 - (row * 64));
  }

  private void prepareTunnels(){
    tunnels.put(6, 15);
    tunnels.put(9, 30);
    tunnels.put(19, 40);
    tunnels.put(26, 47);
    tunnels.put(24, 42);
    tunnels.put(50, 70);
    tunnels.put(54, 66);
    tunnels.put(44, 58);
    tunnels.put(69, 73);
    tunnels.put(64, 78);
	
    tunnels.put(14, 8);
    tunnels.put(23, 5);
    tunnels.put(48, 29);
    tunnels.put(56, 46);
	tunnels.put(61, 59);
	tunnels.put(79, 63);


  }
}